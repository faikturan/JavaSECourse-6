package com.faikturan.core;

import java.util.Scanner;

public class Sample012 {

	public static void main(String[] args) {
		final double pi = 3.14;
		double r, alan, cevre;
		Scanner giris = new Scanner(System.in);
		
		System.out.println("L�tfen Yar��ap Uzunlu�unu Giriniz:");
		r = giris.nextDouble();
		cevre = 2 * pi * r;
		alan = pi * Math.pow(r, 2);
		System.out.printf("�emberin alan� %.2f �evresi %.2f", 
				alan, cevre);

	}

}
