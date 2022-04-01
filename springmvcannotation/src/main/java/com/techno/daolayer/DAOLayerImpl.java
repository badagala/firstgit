package com.techno.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.techno.dto.Shops;

@Repository
public class DAOLayerImpl implements DAOLayer{
	
	@PersistenceUnit
	private EntityManagerFactory manager;

	@Override
	public boolean insertshop(Shops shop) {
		
		boolean isInserted=false;
		EntityManager manage=manager.createEntityManager();
		EntityTransaction transact = manage.getTransaction();
		try {
			transact.begin();
			manage.persist(shop);
			transact.commit();
			isInserted = true;
		}catch(Exception e) {
			transact.rollback();
			e.printStackTrace();
		}
		
	
		return isInserted;
	}

	@Override
	public boolean updateshop(Shops updateshop) {
		boolean isupdated =false;
		EntityManager man=manager.createEntityManager();
		EntityTransaction transacts=man.getTransaction();
		try {
			transacts.begin();
			Shops sho=man.find(Shops.class,updateshop.getShopid());
			
			if(updateshop.getItems()!=null && updateshop.getItems()!=" ") {
				sho.setItems(updateshop.getItems());
			}
		    if(updateshop.getName()!=null && updateshop.getName()!=" ") {
		    	sho.setName(updateshop.getName());
		    }
		    transacts.commit();
		    isupdated=true;
		}catch(Exception e) {
			e.printStackTrace();
			transacts.rollback();
		}
		
		
		return isupdated;
	}

	@Override
	public Shops retrieveshop(int shopid) {
		EntityManager mana = manager.createEntityManager();
		Shops shop = mana.find(Shops.class, shopid);
		
		
		return shop;
	}

	@Override
	public boolean deleteshop(int shopid) {
		boolean isdeleted= false;
		EntityManager manage=manager.createEntityManager();
		EntityTransaction transact=manage.getTransaction();
		try {
			transact.begin();
			Shops deleted=manage.find(Shops.class, shopid);
			manage.remove(deleted);
			transact.commit();
			isdeleted=true;
			
		}catch(Exception e) {
			e.printStackTrace();
			transact.rollback();
		}
		
		return isdeleted ;
	}

}
