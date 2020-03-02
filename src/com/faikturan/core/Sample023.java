package com.faikturan.core;

import java.util.Scanner;

public class Sample023 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("0 ile 100 arasýnda bir sayý giriniz: ");
		
		int guess = -1;
		while (guess != number) {
			System.out.println("\nTahmininizi giriniz.");
			guess = input.nextInt();
			
			if(guess == number)
				System.out.println("Tahmininiz doðru " +number);
			else if( guess > number)
				System.out.println("Tahmininiz yüksek. ");
			else
				System.out.println("Tahmininz düþük.");
		}

	}

}
