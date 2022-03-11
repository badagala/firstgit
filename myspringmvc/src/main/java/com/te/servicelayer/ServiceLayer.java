package com.te.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.DAOLayer;
import com.te.dtolayer.Users;

@Service
public class ServiceLayer {
	
	@Autowired
	private DAOLayer dao;
	
	public boolean getobject(Users user) {
		
		return dao.getUsersdetail(user);
		
	}
	public Users fetchthedata(String name) {
		Users retrieveuser = dao.getuser(name);
		
		return retrieveuser;
		
	}
	public boolean updateTrainee(String name , String mobileno) {
		return dao.updatetrainee(name,mobileno);
	}
	
	public boolean deletetrainee(String name) {
		return dao.deletetrainee(name);
	}
	
}
