package com.gss.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenceInString {
	
	public static void main(String[] args) {
		
		String value="Java is awesome Java is simple";
		
		Map<String,Long> result=Arrays.stream(value.toLowerCase().split("\\s+")).collect(Collectors.groupingBy(word -> word,Collectors.counting()));
		result.forEach((word,count)-> System.out.println(word+":"+count));
		
	}

}
