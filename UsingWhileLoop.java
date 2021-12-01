package com.technoelevate.collections;

import java.util.LinkedList;

public class UsingWhileLoop {

	public static void main(String[] args) {
		LinkedList<String> sg = new LinkedList<>();
		
		sg.add("Bharath ane nenu");
		sg.add("Maharshi");
		sg.add("Doookudu");
		sg.add("Srimanthudu");
		
		iterateUsingWhileLoop(sg);
	}
	public static void iterateUsingWhileLoop(LinkedList<String>sg) {
		
		System.out.println("Iterating the LinkedList using while loop:");
		int i=0;
		
		while(i<sg.size()) {
			System.out.println(sg.get(i) + "");
			i++;
			
		}
		
	}

}
