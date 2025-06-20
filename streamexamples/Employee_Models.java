package com.gss.streamexamples;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee_Models {
	
	public static void main(String[] args) {
		 List<EmployeeData> employee=new ArrayList<EmployeeData>();
		 employee.add(new EmployeeData(1,"Clever",123456,"rhynio"));
		 employee.add(new EmployeeData(2,"Ever",654321,"dhynio"));
		 employee.add(new EmployeeData(3,"Never",54321,"ghynio"));
		 employee.add(new EmployeeData(4,"Dearer",12345,"Chynio"));
		 employee.add(new EmployeeData(5,"Nearer",43528,"Fhynio")); 
		 
			/* Using Optional 
			 * List<Integer> data=Arrays.asList(12000,15000,160000,30000,50000);
			 * 
			 * Optional<Integer>
			 * result=data.stream().sorted(Comparator.reverseOrder()).findFirst();
			 * 
			 * System.out.println(result.get());
			 */
		 //Sorted as Salary
		 List<EmployeeData> sortedOnSalary=employee.stream().sorted(Comparator.comparing(EmployeeData :: getSalary).reversed()).collect(Collectors.toList());
		 System.out.println(sortedOnSalary);
		 
		 //Sorted on Id removed reverse method
		 List<EmployeeData> sortedOnId=employee.stream().sorted(Comparator.comparing(EmployeeData :: getId)).collect(Collectors.toList());
		 System.out.println(sortedOnId);
		 
		 
		 
		
	}

}
