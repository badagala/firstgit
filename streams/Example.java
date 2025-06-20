package com.gss.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("madam", "racecar", "java", "level","hello");
		
		List<String> palindromes = words.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
				System.out.println(palindromes); // Output: [madam, racecar, level]

    }	
}


