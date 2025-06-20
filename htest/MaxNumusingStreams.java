package com.gss.htest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNumusingStreams {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(5,1,0,10,20,30,45,55,65,75,85,95,98,101,105);
		 
		//maximum number
		Optional<Integer> result=numbers.stream().max(Integer :: compareTo); 
		
		result.ifPresent(max -> System.out.println("Maximum number is :"+max));
		
		//minimum number
		Optional<Integer> minNumber=numbers.stream().min(Integer :: compareTo);
		
		minNumber.ifPresent(min ->System.out.println("Minimum number is :"+min));
		
		//minimum of three
		List<Integer> minThree=numbers.stream().sorted().limit(3).collect(Collectors.toList());
		
		//maximum of three
		List<Integer> maxThree=numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println("Minimum numbers of three are :"+minThree);
		System.out.println("Maximum numbers of first three are :"+ maxThree);
		
		/*PartitioningBy() Method in java 8
		 * 
		 * The partitioningBy() method in Java's Stream API is a specialization of the
		 * groupingBy() method that divides the elements of a stream into exactly two
		 * groups based on a predicate. It returns a Map<Boolean, List<T>>, where:
		 * 
		 * true represents the group of elements that satisfy the predicate. false
		 * represents the group of elements that do not satisfy the predicate
		 */
		Map<Boolean, List<Integer>> partioned=numbers.stream().collect(Collectors.partitioningBy(n -> n%2==0));
		
		System.out.println("Even numbers are:"+partioned.get(true));
		System.out.println("odd numbers are:"+partioned.get(false));
		
		
	}

}
