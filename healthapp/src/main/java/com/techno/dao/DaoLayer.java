package com.techno.dao;

import java.util.List;

import com.techno.dto.Doctors;
import com.techno.dto.Patients;

public interface DaoLayer {
	
	public boolean signUpDoc(Doctors doc);

	public boolean loginForPat(int aadharNumber, String password);

	public boolean loginForDoc(int id, String password);

	public boolean signUpPat(Patients pat);

	public List<Doctors> getAllDoctors();

	public List<Patients> getAllPatients();

	public boolean updateDoc(Doctors doc);

	public boolean updatePat(Patients pat);


}
