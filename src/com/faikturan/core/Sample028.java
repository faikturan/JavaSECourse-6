package com.faikturan.core;

public class Sample028 {

	public static void main(String[] args) {
		//table headline
		System.out.println("              Multiplication Table");
		
		
		//number title
		System.out.print("  ");
		for(int j = 1; j <= 9; j++)
			System.out.print("   " +j);
		
		System.out.println("\n-----------------------------");
		
		//Print the body
		for (int i = 1; i <= 9; i++) {
			System.out.print(i+ " | ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%5d", i*j);
			}
			System.out.println();
		}
	}

}
