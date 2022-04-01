package com.te;

public class SuperHeros {
 private  String name;
 private String power;
 private String weapon;
 private int id;
 
@Override
public String toString() {
	return "SuperHeros [name=" + name + ", power=" + power + ", weapon=" + weapon + ", id=" + id + "]";
}
public SuperHeros(String name, String power, String weapon, int id) {
	super();
	this.name = name;
	this.power = power;
	this.weapon = weapon;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPower() {
	return power;
}
public void setPower(String power) {
	this.power = power;
}
public String getWeapon() {
	return weapon;
}
public void setWeapon(String weapon) {
	this.weapon = weapon;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 
 
	
	}


