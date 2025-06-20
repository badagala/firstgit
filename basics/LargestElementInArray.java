package com.gss.basics;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr= {20,95,55,65,75,105,106};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]>max) 
				max=arr[i];
		}
		System.out.println(max);
	}

}
