package com.technoelevate.collections;

import java.util.LinkedList;

public class IterationsUsingForLoop {
	
	
	public static void main(String[] args) {
		
		 LinkedList<Integer>ll=new LinkedList<>();
		 
		ll.add(75);
		ll.add(55);
		ll.add(66);
		ll.add(99);
		ll.add(84);
		ll.add(87);
		
		iterateUsingForLoop(ll);
	}
		
	public static void iterateUsingForLoop(LinkedList<Integer>ll){
			{
				System.out.println("Iterating the LinkedList using for loop:");
				
				for (int i=0; i<ll.size(); i++) {
					System.out.println(ll.get(i) +"");
					
				}
			
		}
		}
}
		
		
