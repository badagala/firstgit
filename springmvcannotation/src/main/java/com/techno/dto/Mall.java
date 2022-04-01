package com.techno.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Mall {
	
	private int statuscode;
	private String message;
	private String description;
	
	@Autowired
	private Shops shop;

	public Mall(int statuscode, String message, String description, Shops shop) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.description = description;
		this.shop = shop;
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Shops getShop() {
		return shop;
	}

	public void setShop(Shops shop) {
		this.shop = shop;
	}

	public Mall() {
		super();
	}

	@Override
	public String toString() {
		return "Mall [statuscode=" + statuscode + ", message=" + message + ", description=" + description + ", shop="
				+ shop + "]";
	}
	
	
	
	

}
