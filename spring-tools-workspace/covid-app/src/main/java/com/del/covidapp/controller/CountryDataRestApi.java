package com.del.covidapp.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.del.covidapp.model.CountryData;
import com.del.covidapp.model.JobDetails;
import com.del.covidapp.model.JobResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CountryDataRestApi {
	
	RestTemplate rt = new RestTemplate();

	@GetMapping("/country/{country}")
	public CountryData fetchCountryData(@PathVariable String country) throws IOException {
		
		//Object data = rt.getForObject("https://covid19.mathdro.id/api/countries/"+country, Object.class);
		
		CountryData countryData = new CountryData();
		URL url = new URL("https://covid19.mathdro.id/api/countries/"+country);
		JsonNode jsonNode = new ObjectMapper().readTree(url);
		countryData.setConfirmed(jsonNode.get("confirmed").get("value").asLong());
		countryData.setRecovered(jsonNode.get("recovered").get("value").asLong());
		countryData.setDeaths(jsonNode.get("deaths").get("value").asLong());
		
		return countryData;
		
		
	}
	
	@GetMapping("/jobs/{company}")
	public JobResult getJobResult(@PathVariable String company) throws IOException {
		
		JobResult jobResult = new JobResult();
		List<JobDetails> jobDetailsList = new ArrayList<>();
		
		URL url = new URL("https://www.themuse.com/api/public/jobs?page=1&company="+company);
		JsonNode jobResultsJson = new ObjectMapper().readTree(url);
		jobResultsJson.get("results").forEach(node->{
			JobDetails jobDetails = new JobDetails();
			jobDetails.setCompany(node.get("company").get("name").textValue());
			jobDetails.setLocations(node.get("locations").findValuesAsText("name"));
			jobDetails.setCategories(node.get("categories").findValuesAsText("name"));
			jobDetails.setLevels(node.get("levels").findValuesAsText("name"));
			jobDetailsList.add(jobDetails);
		});
		
		
//		jobDetails.setCategories(jobResultsJson.get("results").get("categories").findValuesAsText("name"));
//		jobResult.setResults(Arrays.asList(jobDetails));
		jobResult.setResults(jobDetailsList);
		return jobResult;
	}
	
	
}

