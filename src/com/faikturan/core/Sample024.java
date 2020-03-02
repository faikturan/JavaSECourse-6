package com.faikturan.core;

import java.util.Scanner;

public class Sample024 {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int result = 0;
		int total = 0;
		int enteredNumber = 0;
		
		do {
			System.out.println("Enter the number: ");
			enteredNumber = scanner.nextInt();
			result += enteredNumber;
			displayProcess(total, enteredNumber, result);
			total = result;
		} while (enteredNumber != 0);

	}

	private static void displayProcess(int a, 
			int b, int result) {
	System.out.printf("%d + %d = %d\n", a, b, result );
	}

}
