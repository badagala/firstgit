package com.gss.base;

import java.util.HashMap;
import java.util.Map;

public class RepeatedLetters {
	
	public static void main(String[] args) {
	
		String input="Pneumonoultramicroscopicsilicovolcanoconiosis";
		
		Map<Character,Integer> occurenceCharacters=new HashMap<Character,Integer>();
		
		for(char c:input.toCharArray()) {
			
			occurenceCharacters.put(c, occurenceCharacters.getOrDefault(c, 0)+1);	
			
		}
		System.out.println(occurenceCharacters);
		
	}
	
	
	
	
	


}
