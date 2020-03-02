package com.faikturan.oop.v3;

public class Fish extends Animal {
	private int gills;
	private int eyes;
	private int fins;
	
	public Fish(String name, int brain, int body, int size, int weight, int gills, 
			int eyes, int fins) {
		super(name, brain, body, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	public void rest() {
		System.out.println("Fish.rest() called.");
	}
	
	public void moveMuscles() {
		System.out.println("Fish.moveMuscles() called.");
	}
	
	public void moveBackFin() {
		System.out.println("Fish.moveBackFin() called.");
	}
	
	public void swim() {
		moveMuscles();
		moveBackFin();
		super.move(100);
	}

	public int getGills() {
		return gills;
	}

	public int getEyes() {
		return eyes;
	}

	public int getFins() {
		return fins;
	}
	
	

}
