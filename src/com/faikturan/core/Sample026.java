package com.faikturan.core;

import java.util.Random;
import java.util.Scanner;

public class Sample026 {

	private static Random random = new Random();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int rndNumber1, rndNumber2, estimate = 0, counter = 1;
		
		while (true) {
			rndNumber1 = random.nextInt(5);
			rndNumber2 = random.nextInt(5);
			System.out.println("Tahmininizi giriniz: ");
			estimate = scanner.nextInt();
			System.out.printf("%d. tahminde = %d\t%d, "
					+ "estimate = %d\n", counter, rndNumber1,
					rndNumber2, estimate);
			
			if (estimate == (rndNumber1 + rndNumber2)) {
				System.out.println("win");
				break;
			}
			++counter;
		}

	}

}
