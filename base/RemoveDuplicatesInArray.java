package com.gss.base;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
	
		int[] arr1={54,84,64,78,54,84,21,12,21};
				
		Set<Integer> value=new HashSet<Integer>();
		
		for(int i:arr1) {
	      value.add(i);
		}
		System.out.println(value);

	}

}
