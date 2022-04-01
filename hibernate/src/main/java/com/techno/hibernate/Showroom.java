package com.techno.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Showroom {
	
	@Id
	private int id;
	//@ManyToOne
	private String name;
	private String area;
	
	//private Bike bike;

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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

//	public Bike getBike() {
//		return bike;
//	}
//
//	public void setBike(Bike bike) {
//		this.bike = bike;
//	}

	@Override
	public String toString() {
		return "Showroom [id=" + id + ", name=" + name + ", area=" + area + ", ]"; //bike=" + bike + "]";
	}

	public Showroom() {
		super();
		
	}
	
}
