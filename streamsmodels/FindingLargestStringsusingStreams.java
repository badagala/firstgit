package com.gss.streamsmodels;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindingLargestStringsusingStreams {
	
	public static void main(String[] args) {
		
		List<String> values=Arrays.asList("Ravi","Teja","Tarun","srikanth","swamy","swamy","Teja");
		
		List<String> values1=Arrays.asList("cpu","Monitor","keyboard","mouse");
		
		List<String> result=Stream.concat(values.stream(), values1.stream()).sorted().collect(Collectors.toList());
		
		
		//values.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		//values.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		//values.stream().filter(result-> result!="").collect(Collectors.toList()).forEach(System.out::println);
		//Optional<String> result=values.stream().max(Comparator.comparingInt(String :: length));
		System.out.println(result);
		
	}

}
