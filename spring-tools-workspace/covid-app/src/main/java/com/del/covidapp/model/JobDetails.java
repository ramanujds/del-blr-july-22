package com.del.covidapp.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor @AllArgsConstructor
public class JobDetails {

	private List<String> locations;
	private List<String> categories;
	private List<String> levels;
	private String company;
	
}
