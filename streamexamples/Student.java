package com.gss.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Student {
	
	public static void main(String[] args) {
		
		List<String> studentData=Arrays.asList("srikanth","Anandram","manisaran","Anil");
		
	    Map<Integer,List<String>> studentNameUc=studentData.stream().collect(Collectors.groupingBy(String :: length));
		//List<String> studentNameUc=studentData.stream().map(a-> a.toUpperCase()).collect(Collectors.toList());	
	
		System.out.println(studentNameUc);
		
	}

}
