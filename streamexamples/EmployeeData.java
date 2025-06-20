package com.gss.streamexamples;

public class EmployeeData {
	
	public int id;
	public String name;
	public long salary;
	public String address;
	
	public EmployeeData(int id,String name,long salary,String address) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public int getId(){
		
		return id;
	}
	public String getName() {
		return name;
	}
	public long getSalary() {
		return salary;
	}
	public String address() {
		return address;
	}
	
	  public String toString() {
	 
	  return "id:"+id+" name:"+name+" salary:"+salary+" address:"+ address+"";
	  }
}
