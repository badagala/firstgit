package com.techno.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.daolayer.DAOLayer;
import com.techno.dto.Flight;

@Service
public class ServiceLayerImpl implements ServiceLayer {
	@Autowired
	private DAOLayer dao;

	@Override
	public boolean isInserting(Flight flight) {

		return dao.insert(flight);
	}

	@Override
	public boolean isUpdating(Flight update) {

		return dao.update(update);
	}

	@Override
	public Flight isFetching(int ticketno) {

		return dao.retrieve(ticketno);
	}

	@Override
	public boolean isDeleting(int ticketno) {

		return dao.delete(ticketno);
	}

}
