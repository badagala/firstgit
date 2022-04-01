package com.techno.daolayer;

import com.techno.dto.Flight;

public interface DAOLayer {

	public boolean insert(Flight flight);
	public boolean update(Flight updateflight);
	public Flight retrieve(int ticketno);
	public boolean delete(int ticketno);
	
	

}
