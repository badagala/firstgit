package com.techno.servicelayer;

import com.techno.dto.Flight;

public interface ServiceLayer {
	
	public boolean isInserting(Flight flight);
	public boolean isUpdating(Flight update);
	public Flight isFetching(int ticketno);
	public boolean isDeleting(int ticketno);
	

}
