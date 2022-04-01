package com.te.jpawithhibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hostel {
	@Id
	private String name;
	private int rooms;
	private String address;
	@OneToMany
	private Room room;
	
	public Hostel(String name, int rooms, String address, Room room) {
		super();
		this.name = name;
		this.rooms = rooms;
		this.address = address;
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Hostel [name=" + name + ", rooms=" + rooms + ", address=" + address + ", room=" + room + "]";
	}
	
	
}
