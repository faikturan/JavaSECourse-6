package com.faikturan.core;

import java.util.Scanner;

public class Sample022 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("0 ile 100 arasýnda bir sayý giriniz: ");
		
		int guess = input.nextInt();
		
		if(guess == number)
			System.out.println("Tahmininiz doðru " +number);
		else if( guess > number)
			System.out.println("Tahmininiz yüksek. ");
		else
			System.out.println("Tahmininz düþük.");
	}

}
