package com.goodee.ex01.xml02;

public class Car {
	
	// filed
	private String model; 	// xDrive 40d
	private int price;		// 13140
	private Engine engine;  
	
	public Car() {
		
	}

	
	//getter/setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void info() {
		System.out.println("차량모델 : " + model);
		System.out.println("가격 : " + price +"만원");
		engine.info();
	}
	
	
}
