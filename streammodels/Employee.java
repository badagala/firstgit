package com.gss.streammodels;

public class Employee {
	
	public int id;
	public int age;
	public String name;
	public String domain;
	public long salary;
	public String address;
	
	public Employee(int id,int age,String name,String domain,long salary,String address) {
		this.id=id;
		this.age=age;
		this.name=name;
		this.domain=domain;
		this.salary=salary;
		this.address=address;
	}
	
	public String toString() {
		
		return "Employee[id="+id+", age="+age+", name="+name+", domain="+domain+", salary="+salary+", address="+address+"]";
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getDomain() {
		return domain;
	}
	public long getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDomain(String domain) {
		this.domain=domain;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
}
