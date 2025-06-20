package com.gss.collectionexamples;

import java.util.ArrayList;

public class ExampleForArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> value=new ArrayList<String>();
		
		value.add("One");
		value.add("Two");
		
		ArrayList<String> value1=new ArrayList<String>();
		value1.add("Three");
		value1.add("Four");
		
	value1.set(1, "Three");
	value1.set(0, "Four");
	System.out.println(value1);
		
//		ArrayList<String> value2=new ArrayList<>(value);
//		
//		value2.addAll(value1);
//		System.out.println(value2);
//		
		
		//System.out.println(value);
		//System.out.println(value.get(1));
	}

}
