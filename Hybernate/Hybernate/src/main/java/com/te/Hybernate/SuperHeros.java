package com.te.Hybernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuperHeros {

	@Id
	private int superId;
	private String superName;
	private String superPower;
	private String weapon;
	
	private SuperVillains supervillains;

	public SuperHeros() {
	}

	public SuperHeros(int superId, String superName, String superPower, String weapon,SuperVillains supervillains) {
		super();
		this.superId = superId;
		this.superName = superName;
		this.superPower = superPower;
		this.weapon = weapon;
		this.supervillains=supervillains;
	}

	public SuperVillains getSupervillains() {
		return supervillains;
	}

	public void setSupervillains(SuperVillains supervillains) {
		this.supervillains = supervillains;
	}

	public int getSuperId() {
		return superId;
	}

	public void setSuperId(int superId) {
		this.superId = superId;
	}

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "SuperHeros [superId=" + superId + ", superName=" + superName + ", superPower=" + superPower
				+ ", weapon=" + weapon + "]";
	}

}
