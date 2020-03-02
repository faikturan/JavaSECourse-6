package com.faikturan.oop.v3;

public class Dog extends Animal{
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, 
			int legs, int tail, int teeth, String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	public void chew() {
		System.out.println("Dog.chew() called.");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called.");
		chew();
		super.eat();
	}
	
	public void  walk() {
		System.out.println("Dog.walk() called.");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called.");
		super.move(10);
	}
	
	public void movelegs(int speed) {
		System.out.println("Dog.movelegs() called.");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called.");
		movelegs(speed);
		super.move(speed);
	}
	
	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}

	public int getTail() {
		return tail;
	}

	public int getTeeth() {
		return teeth;
	}

	public String getCoat() {
		return coat;
	}



}
