package com.gss.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicatesinStreams {
	
	public static void main(String[] args) {
		
		//List<String> input=Arrays.asList("Carrot","Potato","Apple","Bananna","Mango","Mango","Carrot","Bringal","Onion","Onion");
		
		List<Integer> input=Arrays.asList(10,20,30,40,50,23,12,21,21,10,20,30,30);		
		//HashSet<String> addingDuplicates=new HashSet<>();
		HashSet<Integer> addingDuplicates=new HashSet<>();
		
		Set<Integer> result=input.stream().filter(n->!addingDuplicates.add(n)).collect(Collectors.toSet());
		
		System.out.println(result);
		
		/*If the element is present in the set already, then this Set.add() returns false, we can collect them.Set.add() returns false if the element
		 * was already present in the set.filter such element and collect duplicate elements in the set 
		 */
		
		
	}

}
