package com.faikturan.oop.v1;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public Car() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("carrera") || validModel.equals("comodore")) {
			this.model = model;
		} else {
			this.model = "Bilinmiyor";
		}
		
	}
	
	

}
