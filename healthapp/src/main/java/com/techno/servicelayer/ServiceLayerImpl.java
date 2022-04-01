package com.techno.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techno.dao.DaoLayer;
import com.techno.dto.Doctors;
import com.techno.dto.Patients;

@Service
public class ServiceLayerImpl implements ServiceLayer{
	
	@Autowired
	private DaoLayer dao;

	public boolean signUpDoc(Doctors doc) {
		return dao.signUpDoc(doc);
	}

	public boolean loginForPat(int aadharNumber, String password) {
		return dao.loginForPat(aadharNumber, password);
	}

	public boolean loginForDoc(int id, String password) {
		return dao.loginForDoc(id, password);
	}

	public boolean signUpPat(Patients pat) {

		return dao.signUpPat(pat);
	}

	public List<Doctors> getAllDoctors() {
		return dao.getAllDoctors();
	}

	public List<Patients> getAllPatients() {
		return dao.getAllPatients();
	}

	public boolean updateDoc(Doctors doc) {
		return dao.updateDoc(doc);
	}

	public boolean updatePat(Patients pat) {
		return dao.updatePat(pat);
	}

}
