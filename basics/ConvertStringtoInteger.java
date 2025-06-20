package com.gss.basics;

import java.util.Arrays;
import java.util.List;


public class ConvertStringtoInteger {
	
	public static void main(String[] args) {
		List<String> values=Arrays.asList("1","2","3");
		
	   int result=values.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(result);
	}
	
	//maximum number/salary using sql query
	// select column_name max(column_name) from table_name group by column_name;
	// ex: select dept_id max(salary) from department group by dept_id 
	

}
