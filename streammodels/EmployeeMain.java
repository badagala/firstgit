package com.gss.streammodels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeMain {
	
	public static void main(String args[]) {
		
	List<Employee> employee=new ArrayList<Employee>();
	employee.add(new Employee(1,24,"abc","IT",27000,"xyz"));
	employee.add(new Employee(2,25,"cde","Admin",67500,"zyx"));
	employee.add(new Employee(3,28,"fgh","Sales",47500,"pqr"));
	employee.add(new Employee(4,29,"ijk","Accounts",57500,"rst"));
	employee.add(new Employee(5,30,"lmn","Product",37500,"opq"));
	
	List<Employee> employeeData_basedon_salary=employee.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).collect(Collectors.toList());
	
	System.out.println(employeeData_basedon_salary);
		
	}

}
