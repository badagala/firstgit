package com.gss.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsInJava8 {
	
	public static void main(String args[]) {
	
	  List<String> carsList = new ArrayList<>();
	  
	
	  carsList.add("BMW,  X7");
	  carsList.add("BMW, X1");
	  carsList.add("Benz Gls");
	  carsList.add("Benz glc");
	  carsList.add("Audi A6");
	  carsList.add("Audi Q3");
	  carsList.add("Audi Q2");
	  carsList.add("Audi A3");
	  carsList.add("Hyundai Creata");
	  carsList.add("Hyundai Tucson");
	  carsList.add("Hyundai Alacazar");
	  
	  
	  carsList.stream().filter((data) -> data.startsWith("Hyundai")).map(data -> data.toUpperCase()).sorted().forEach((data)-> System.out.println(data)) ;
	  
	   //.map((data) -> data.toUpperCase()).sorted().forEach((data)-> System.out.println(data))
	  
	 // List citylist = Arrays.asList("delhi", "mumbai", "hyderabad", "ahmedabad", "indore", "patna"). stream(). map(String::toUpperCase).collect(Collectors.toList());

	}       
	    
}
