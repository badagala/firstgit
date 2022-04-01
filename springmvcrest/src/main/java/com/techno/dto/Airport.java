package com.techno.dto;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Airport {
	
	private int statuscode;
	private String message;
	private String description;
	
	@Autowired
	private Flight flight;

}
