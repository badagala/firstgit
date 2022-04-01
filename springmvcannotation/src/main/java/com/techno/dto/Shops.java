package com.techno.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonRootName;


@Entity
@JsonRootName("shops-info")
public class Shops implements Serializable {
	@Id
	private int shopid;
	private String name;
	private String items;
	
	public Shops(int shopid, String name, String items) {
		super();
		this.shopid = shopid;
		this.name = name;
		this.items = items;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Shops() {
		super();
	}

	@Override
	public String toString() {
		return "Shops [shopid=" + shopid + ", name=" + name + ", items=" + items + "]";
	}
	
	

}
