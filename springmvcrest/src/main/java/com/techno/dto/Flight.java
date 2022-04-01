package com.techno.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class Flight implements Serializable{
	@Id
	private int ticketno;
	private String arrival;
	private String destination;
	private String flightname;
	

}
