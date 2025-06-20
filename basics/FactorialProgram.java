package com.gss.basics;

import java.util.Scanner;

public class FactorialProgram {
	
	public static void main(String[] args) {
		
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the value :");	
		int number=value.nextInt();
		value.close();
	    long factorial=1;
	    
	    if(number < 0) {
	    	System.out.println("Cannot find the factorial of a negtive number");
	    	
	    }else if(number <= 1) {
	    	System.out.printf("%d! = %d",number,factorial);
	    	
	    }else {
	    	for(int result=number; result >=2; result --) {
	    		factorial=factorial*result;
	    	}
	    	System.out.printf("%d! = %d",number,factorial);
	    }
	    
	    
	}

}
