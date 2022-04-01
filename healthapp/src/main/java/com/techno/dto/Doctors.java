package com.techno.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Doctors")
public class Doctors {
	@Id
	@Column(name = "DoctorsId")
	private int id;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Specialist")
	private String specialistIn;
	@Column(name = "ContactNumber")
	private String contactNumber;
	@Column(name = "Password")
	private String password;


}
