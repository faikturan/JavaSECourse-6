package com.faikturan.oop.v3;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 2, 4, 2, 20, "long silkly");
		dog.eat();
		dog.walk();
		dog.run();
		System.out.println("Animal :" +animal.getName());
		
		System.out.println("Dog: " + dog.getName());
		
		Fish hamsi = new Fish("Hamsi", 1, 1, 5, 15, 2, 2, 2);
		hamsi.eat();
		hamsi.moveBackFin();
		
		System.out.println("Hamsi: " +hamsi.getName() + hamsi.getSize());
		

	}

}
