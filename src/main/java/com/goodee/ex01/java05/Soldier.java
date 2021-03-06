package com.goodee.ex01.java05;

import java.util.Map;

public class Soldier {

	private String name;
	private Gun gun;
	private Map<String, String> army;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gun getGun() {
		return gun;
	}
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	public Map<String, String> getArmy() {
		return army;
	}
	public void setArmy(Map<String, String> army) {
		this.army = army;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("총기모델 : " + gun.getModel());
		System.out.println("총알수 : " + gun.getBullet());
		System.out.println("부대명 : " + army.get("부대명"));
		System.out.println("부대위치 : " + army.get("부대위치"));
	}
	
	
}
