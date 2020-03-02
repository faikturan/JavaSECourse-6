package com.faikturan.core;

public class Sample032 {

	public static void main(String[] args) {
		int counter = 0;
		int i = 2;
		while (counter<50) {
			if (isBoolean(i)) {
				System.out.println((counter + 1)+ " .asal sayý= "+i);
				counter++;
			}
			i++;
		}
	}
	
	public static boolean isBoolean(int n) {
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
