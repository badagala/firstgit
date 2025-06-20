package com.gss.base;

public class MinandMaxNumberinArray {
	
	public static void main(String[] args) {
		
		int[] input= {10,20,22,32,57,85,55,62};
		int max=input[0];
		int min=input[0];
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
			for(int j=0;j<input.length;j++) {
				
				if(!(input[j]>min) && input[j]>min) {
					min=input[j];
					
				}	
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
