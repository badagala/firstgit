package com.techno.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.techno.dto.Flight;

@Repository
public class DAOLayerImpl implements DAOLayer {


	private EntityManagerFactory factory =Persistence.createEntityManagerFactory("flight-info");

	@Override
	public boolean insert(Flight flight) {
		boolean isinserted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transact = manager.getTransaction();
		try {
			transact.begin();
			manager.persist(flight);
			transact.commit();
			isinserted = true;

		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();

		}

		return isinserted;
	}

	@Override
	public boolean update(Flight updateflight) {
		boolean b = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transact = manager.getTransaction();

		try {
			transact.begin();
			Flight flight = manager.find(Flight.class, updateflight.getTicketno());

			if (updateflight.getTicketno() != 0) {
				flight.setTicketno(updateflight.getTicketno());
			}
			if (updateflight.getFlightname() != null && updateflight.getFlightname() != "") {
				flight.setFlightname(updateflight.getFlightname());
			}
			if (updateflight.getArrival() != null && updateflight.getArrival() != "") {
				flight.setArrival(updateflight.getArrival());
			}
			if (updateflight.getDestination() != null && updateflight.getDestination() != "") {
				flight.setDestination(updateflight.getDestination());
			}
			b = true;
			transact.commit();

		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public Flight retrieve(int ticketno) {
		EntityManager manager=factory.createEntityManager();
		Flight flight=manager.find(Flight.class,ticketno);

		return flight;
	}

	@Override
	public boolean delete(int ticketno) {
		boolean isdeleted =false;
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transact = manager.getTransaction();
		try {
			transact.begin();
			Flight flight=manager.find(Flight.class,ticketno);
			manager.remove(flight);
			isdeleted=true;
			transact.commit();
			
		}catch(Exception e) {
			transact.rollback();
			e.printStackTrace();
			
		}

		return isdeleted;
	}

}
