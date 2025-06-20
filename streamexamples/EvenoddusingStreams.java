package com.gss.streamexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenoddusingStreams {
	
	public static void main(String[] args) {
		List<Integer> input=Arrays.asList();
		/*
		 * List<Integer>
		 * output=input.stream().filter(a->a%2==0).collect(Collectors.toList());
		 * System.out.println(output);
		 */
		
		/* Maximum number using max()
		 * 
		 * Optional<Integer> maxvalue=input.stream().max(Integer :: compareTo );
		 * 
		 * System.out.println(maxvalue.get());
		 */
		
		/*
		 * Minimum value using min()
		 * 
		 * Optional<Integer> minNumber=input.stream().min(Integer :: compareTo);
		 * System.out.println(minNumber.get());
		 */
		int maxvalue=input.stream().max(Integer :: compareTo ).orElse(0);
		//System.out.println(maxvalue.orElseThrow(()-> new IllegalArgumentException("1234")));
		System.out.println(maxvalue);
		
		
	}

}
