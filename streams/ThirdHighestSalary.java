package com.gss.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdHighestSalary {
	
	public static void main(String[] args) {

		List<Integer> thirdHighestSalary=Arrays.asList(10000,20000,15864,54546,28665,54554,25484);
		thirdHighestSalary.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out :: println);
		
		//SELECT * FROM `employee` ORDER BY `salary` DESC LIMIT 1 OFFSET 2;
	}

}
