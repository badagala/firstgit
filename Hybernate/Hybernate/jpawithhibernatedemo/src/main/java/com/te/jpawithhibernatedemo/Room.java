package com.te.jpawithhibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	private String name;
	private int numbers;
	
	public Room(String name, int numbers) {
	
		this.name = name;
		this.numbers = numbers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	@Override
	public String toString() {
		return "Room [name=" + name + ", numbers=" + numbers + "]";
	}
	

}
