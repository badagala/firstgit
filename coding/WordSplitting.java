package com.gss.coding;

public class WordSplitting {
	
	public static void main(String[] args) {
		String value="Hello World";
		String[] splitValue=value.split("\\s");
		String value1 = splitValue[0];
		String value2=splitValue[1];
		String result="";
		for(int i=0;i<5;i++) {
			 result=result+value1.charAt(i);
			result=result+value2.charAt(i);	
			
		}
		 System.out.println(result);
		 
		
	}

}
