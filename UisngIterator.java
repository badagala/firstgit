package com.technoelevate.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UisngIterator {

	public static void main(String[] args) {
		LinkedList<Integer> lk = new LinkedList<>();
		
		lk.add(10);
		lk.add(50);
		lk.add(60);
		lk.add(65);
		lk.add(99);
		
		iterateUsingIterator(lk);
	}
	public static void iterateUsingIterator(LinkedList<Integer>lk) {
		
		System.out.println ("Iterating the LinkedList using Iterator:");
		
		Iterator<Integer> it = lk.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next()+" ");
			
		}
		
		

	}

}
