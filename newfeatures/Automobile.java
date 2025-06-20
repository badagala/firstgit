package com.gss.newfeatures;

public class Automobile {

	public Vehicle vehicle;
	
	public Automobile(int type) {
		if(type==1) {
			vehicle=new TwoWheeler();
		}else if(type == 2) {
			vehicle=new FourWheeler();
		}else {
			vehicle=null;
		}
	}
	public Vehicle getVehicle() {
		
		return vehicle;
	}
	
	public static void main(String[] args) {
		Automobile mobStore=new Automobile(1);
		Vehicle pvehicle=mobStore.getVehicle();
		if(pvehicle!=null) {
			pvehicle.printVehicle();
		}
	}
}
