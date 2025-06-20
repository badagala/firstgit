package com.gss.htest;

public class RemovingConsecutiveVowels {
	
	public static void main(String[] args) {
		String value="queue";
		String vowels="aeiou";
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0; i<value.length();i++) {
			if(!vowels.contains(String.valueOf(value.charAt(i)))) {
				result.append(value.charAt(i));
			}else {
				if(!vowels.contains(String.valueOf(value.charAt(i-1)))) {
					result.append(value.charAt(i));
				}
			}
		}
		System.out.println(result.toString());
	}
}
