package com.gss.streamexamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceofWord {
	
	public static void main(String[] args) {
		
		/* counting the repeated words
		 *
		 * List<String>
		 * studentData=Arrays.asList("Tomato","Potato","Brinjal","carrot","Cauliflower",
		 * "Potato","Onion","Potato","Tomato","carrot","Cauliflower"); Map<String, Long>
		 * repeatedWords=studentData.stream().collect(Collectors.groupingBy(c->c,
		 * Collectors.counting())); System.out.println(repeatedWords);
		 */
		String value="pneumonoultramicroscopicsilicovolcanoconiosis";
		
		HashMap<Character,Integer> occurenceOfCharacter=new HashMap<Character,Integer>();
		for(char ch: value.toCharArray()) {
			occurenceOfCharacter.put(ch, occurenceOfCharacter.getOrDefault(ch,0)+1);
		}
		
		System.out.println(occurenceOfCharacter);
		/*
		 * for(Map.Entry<Character,Integer> entry:occurenceOfCharacter.entrySet()) {
		 * System.out.println(entry.getKey()+":"+entry.getValue()); }
		 * 
		 * */
		
	}

	
}
