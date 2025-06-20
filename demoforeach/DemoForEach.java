package com.gss.demoforeach;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {
	
	public static void main(String[] args) {
		
		List<String> listData=Arrays.asList("audi","Bmw","Benz","MG","Lexus","Range Rover","Lexus","Rolls Royce","Audi");

		//This can iterate by using external loops like for, foreach in java 7. Now we can use internal loop in java 8 as the foreach loop
		
		//Using for Loop
		/*for(int i=1;i<listData.size(); i++) {
			System.out.println(listData.get(i));
		}*/
		
		//Using foreach loop 
		/*for(String i:listData) {
			System.out.println(i);
		}*/
		
		//Using internal loop 
		listData.forEach(i->System.out.println(i));
		
	}

}
