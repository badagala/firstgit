package com.te.dtolayer;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Users {
	
	@Id
	private String name;
	private String mobileno;
	private String area;
	
	public Users(String name, String mobileno, String area) {
		
		this.name = name;
		this.mobileno = mobileno;
		this.area = area;
	}
}
