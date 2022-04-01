package com.techno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techno.dto.Airport;
import com.techno.dto.Flight;
import com.techno.servicelayer.ServiceLayer;

@RestController
public class FirstController {
	
	@Autowired
	private ServiceLayer layer;
	

	@PostMapping(path = "/insert", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Airport insertdetails(@RequestBody Flight flight) {
		Airport airport=new Airport();
		if(layer.isInserting(flight)) {
			airport.setStatuscode(200);
			airport.setMessage("Inserted Successfully");
			airport.setDescription("Details which you have entered successfully");
			airport.setFlight(flight);
			}else {
				airport.setStatuscode(400);
				airport.setMessage("Details are not entered");
				airport.setDescription("Details which you want to insert deatails are not successfully entered");
				airport.setFlight(flight);
				
		}return airport;
	}
	
	@GetMapping(path ="/update",produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Airport updatedata(@PathVariable Flight flight) {
		Airport airport = new Airport();
		if(layer.isUpdating(flight)) {
			airport.setStatuscode(200);
			airport.setMessage("Updating");
			airport.setDescription("Updating succsessfully ");
			airport.setFlight(flight);
		}else {
			airport.setStatuscode(400);
			airport.setMessage("Not Updating");
			airport.setDescription("Not entered successfully");
			airport.setFlight(flight);
			
		}return airport;
	}

	@GetMapping(path ="/get/{tokenno}",produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Airport fetchingData(@PathVariable("tokenid")int tokenno) {
		Airport airport = new Airport();
		Flight flight =layer.isFetching(tokenno);
		if(flight!=null) {
			airport.setStatuscode(200);
			airport.setMessage("Check your details");
			airport.setDescription("The details which you have fetched are successfull");
		}else{
			airport.setStatuscode(400);
			airport.setMessage("unable to fetching");
			airport.setDescription("please try another time ");
			
			
			
		}return airport ;
		
	}
	@DeleteMapping(path = "/delete/{tokenno}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Airport deletingData(@PathVariable("tokenno")int tokenno) {
		Airport airport = new Airport();
		if(layer.isDeleting(tokenno)) {
			airport.setStatuscode(200);
			airport.setMessage("Deleting");
			airport.setDescription("Deleted successfully");
			
		}else {
			airport.setStatuscode(400);
			airport.setMessage("no proper info");
			airport.setDescription("please try again ");
			
			
		}return airport;
		
		
	}
	

}
