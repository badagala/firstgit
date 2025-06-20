package com.gss.coding;

public class Reverse {
	static String result="";
	public static void main(String[] args) {
		
		  String data="Evidence"; 
		  
		  for(int i=0;i<data.length(); i++) { 
			
			  result=data.charAt(i)+result;
		 
		 } 
		  System.out.println(result);
	}
}
