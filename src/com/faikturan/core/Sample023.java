package com.faikturan.core;

import java.util.Scanner;

public class Sample023 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("0 ile 100 aras�nda bir say� giriniz: ");
		
		int guess = -1;
		while (guess != number) {
			System.out.println("\nTahmininizi giriniz.");
			guess = input.nextInt();
			
			if(guess == number)
				System.out.println("Tahmininiz do�ru " +number);
			else if( guess > number)
				System.out.println("Tahmininiz y�ksek. ");
			else
				System.out.println("Tahmininz d���k.");
		}

	}

}
