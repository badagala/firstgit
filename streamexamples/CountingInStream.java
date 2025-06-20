package com.gss.streamexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingInStream {
	
	public static void main(String[] args) {
		
		List<Integer> values=Arrays.asList(10,25,55,65,02,52);
		
		
		/*Using reduce method 
		 * 
		 * long result=values.stream().reduce(0,Integer :: sum);
		 * System.out.println(result);
		 */
		
		/* Using Joining method
		 * 
		 * List<String> input=Arrays.asList("Java","is","Awesome"); String
		 * result=input.stream().collect(Collectors.joining());
		 * System.out.println(result);
		 */
		
		Stream<Integer> result=values.stream().sorted(Comparator.reverseOrder()).limit(1);
		
		System.out.println(result);
		
	}

}
