package com.techno.daolayer;

import com.techno.dto.Shops;

public interface DAOLayer {
	
	public boolean insertshop(Shops shop);
	public boolean updateshop(Shops updateshop);
	public Shops retrieveshop(int shopid);
	public boolean deleteshop(int shopid);

}
