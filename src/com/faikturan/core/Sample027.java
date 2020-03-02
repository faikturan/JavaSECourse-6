package com.faikturan.core;

import java.util.Iterator;

public class Sample027 {

	private static final String fmt = "%-5d";
	
	public static void main(String[] args) {
		System.out.println("The Multiplication Table\n");
		
		for (int i = 1; i < 10; i++) {
			System.out.printf(fmt, i);
			
			for (int j = 0; j < 10; j++) {
				System.out.printf(fmt, i*j);
			}
			System.out.println();
		}
		
	}

}
