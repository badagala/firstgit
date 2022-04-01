package com.te.Hybernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuperVillains {
	
	@Id
	private int villainId;
	private String villainName;
	private String villainPower;
	private String weapon;
	private SuperHeros heros;

	public SuperVillains(int villainId, String villainName, String villainPower, String weapon, SuperHeros heros) {
		super();
		this.villainId = villainId;
		this.villainName = villainName;
		this.villainPower = villainPower;
		this.weapon = weapon;
		this.heros = heros;
	}

	public SuperHeros getHeros() {
		return heros;
	}

	public void setHeros(SuperHeros heros) {
		this.heros = heros;
	}

	public SuperVillains() {
		super();

	}

	public int getVillainId() {
		return villainId;
	}

	public void setVillainId(int villainId) {
		this.villainId = villainId;
	}

	public String getVillainName() {
		return villainName;
	}

	public void setVillainName(String villainName) {
		this.villainName = villainName;
	}

	public String getVillainPower() {
		return villainPower;
	}

	public void setVillainPower(String villainPower) {
		this.villainPower = villainPower;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "SuperVillains [villainId=" + villainId + ", villainName=" + villainName + ", villainPower="
				+ villainPower + ", weapon=" + weapon + "]";
	}

}
