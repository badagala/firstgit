package com.gss.coding;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int j=0;
		System.out.println(j);
		int k=1;
		System.out.println(k);
		
		for(int i=0; i<20; i++) {
			int l=j+k;
		   
			System.out.println(l);
			 j=k;
			 k=l;
		}
		
	}
	

}
