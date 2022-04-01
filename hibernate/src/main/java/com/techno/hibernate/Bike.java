package com.techno.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	private int id;
	private String name;
	private String modelno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", modelno=" + modelno + "]";
	}
	public Bike() {
		super();
		
	}
	
	
	
	

}
