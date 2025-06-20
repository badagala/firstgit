package com.gss.test;

public class CountTheUppercaseInWord {
	public static void main(String[] args) {
		String str="This trip wanna Makes us a SPecial moments for lifeLong";
		int count=0;
		
		for(char c: str.toCharArray()) {
			
			if(Character.isUpperCase(c)) {
				
				System.out.print(c);
				count++;
			}
			
		}
		System.out.println(":"+count);
	}
	

}
