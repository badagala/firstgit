package com.gss.base;

public class LargestElementInArray {

	public static void main(String[] args) {
		
	int[] arr= {70,52,58,7,66,56};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}

	System.out.println(max);
	}
}
