package com.gss.base;

import java.util.HashMap;
import java.util.Map;

public class OccurenceString {

	public static void main(String[] args) {
		String input="occurenceofaletter";
		
		HashMap<Character,Integer> char_count=new HashMap<Character,Integer>();
		
		for(char charValue: input.toCharArray()) {
			char_count.put(charValue, char_count.getOrDefault(charValue, 0)+1);
		}
		System.out.println("Character Occurences:");
		for(Map.Entry<Character,Integer> entry : char_count.entrySet()) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}
}
