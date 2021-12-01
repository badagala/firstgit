package com.technoelevate.collections;

import java.util.LinkedList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		LinkedList<String> lg = new LinkedList<>();
		
	lg.add("IronMAN");
	lg.add("BatMan");
	lg.add("SuperMan");
	lg.add("SpiderMan");
	
	iterateUsingEnhancedForLoop(lg);
		
	}
	public static void iterateUsingEnhancedForLoop(LinkedList<String>lg) {
		
		System.out.println("Iterating the LinkedList using enhanced for loop:");
		
		for(String listElement : lg) {
			System.out.println(listElement+" ");
			
			
		}
		
	}

}
