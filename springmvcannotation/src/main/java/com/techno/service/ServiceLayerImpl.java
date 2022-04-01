package com.techno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.daolayer.DAOLayer;
import com.techno.dto.Shops;

@Service
public class ServiceLayerImpl implements ServiceLayer{
	
	@Autowired
	private DAOLayer dao;

	@Override
	public boolean insertshop(Shops shop) {
		
		return dao.insertshop(shop);
	}

	@Override
	public boolean updateshop(Shops updateshop) {
		
		return dao.updateshop(updateshop);
	}

	@Override
	public Shops retrieveshop(int shopid) {
		
		return dao.retrieveshop(shopid);
	}

	@Override
	public boolean deleteshop(int shopid) {
		
		return dao.deleteshop(shopid);
	}
	
	

}
