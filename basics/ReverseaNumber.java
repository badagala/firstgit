package com.gss.basics;

public class ReverseaNumber {
	
	public static void main(String[] args) {
		
		//public static void main(String[] args) {
			int number =987654, reverse=0;
			while(number>0)
			{
				int remainder =number%10;
				reverse=reverse*10+remainder;
				number=number/10;
			}
	System.out.println("The reverse of the given number is:"+reverse);
		
		/*int num=543;
		int revNumber = 0;
		
		while(num<0) {
			int remainder=num%10;
			num=num/10;
			 revNumber=(0*revNumber)+remainder;*/
		//}
		
	//	System.out.println("Reverse of a Number is :"+revNumber);
	}

}
