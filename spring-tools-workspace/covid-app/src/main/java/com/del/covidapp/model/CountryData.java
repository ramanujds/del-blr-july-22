package com.del.covidapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CountryData {

	private long confirmed;
	private long recovered;
	private long deaths;
	
}
