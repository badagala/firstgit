package com.gss.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEmployees {
	
	public static void main(String[] args) {
		
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(1,"Ravi",28,30000,"Male","software","Hyderabad",2019));
		employee.add(new Employee(101,"Swamy",38,1130000,"Male","software","Hyderabad",2010));
		employee.add(new Employee(505,"Loki",45,550000,"Male","IT","Visakhaptnam",2001));
		employee.add(new Employee(202,"vijay",19,73000,"Male","IT","Hyderabad",2021));
		employee.add(new Employee(53,"tarun",14,83000,"Male","software","Visakhaptnam",2018));
		
		//List<Employee> empDeptAscendingh=employee.stream().sorted(Comparator.comparing(Employee :: getName)).collect(Collectors.toList());
		//List<Employee> empDeptDecending=employee.stream().sorted(Comparator.comparing(Employee :: getName).reversed()).collect(Collectors.toList());
		//List<Employee> empSalaryAscending=employee.stream().sorted(Comparator.comparing(Employee :: getSalary)).collect(Collectors.toList());
		//List<Employee> empSalaryDecending=employee.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).collect(Collectors.toList());
		//Optional<Employee> empSalaryDecending=employee.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).findFirst();
		List<Employee> empSalaryDecending=employee.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).skip(2).limit(1).collect(Collectors.toList());
		System.out.println(empSalaryDecending);
	}
}
