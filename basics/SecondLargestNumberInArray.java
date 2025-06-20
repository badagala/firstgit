package com.gss.basics;

public class SecondLargestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] input= {1,2,3,45,5,8,50,66};
		int max=input[0];
		int secondLargest=input[0];
	
		for(int i=0;i<input.length;i++) {
		  if(input[i]>max) {
			 // System.out.println("input value:"+input[i]);
			  max=input[i]; 
		  }
		}
		System.out.println("First Maximum number is: "+max);
		for(int j=0;j<input.length;j++) {
			
			if(input[j]!=max && input[j]>secondLargest) {
				if(input[j]>secondLargest) {
					secondLargest=input[j];
				}
				
			}
		}System.out.println("secondLargest Value: "+secondLargest);
		
	}

}
