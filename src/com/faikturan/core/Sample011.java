package com.faikturan.core;

import java.util.Scanner;

public class Sample011 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int kisaKenar;
		System.out.println("K�sa Kenar Degerini Giriniz:");
		kisaKenar = giris.nextInt();
		int uzunKenar;
		System.out.println("Uzun Kenar Degerini Giriniz:");
		uzunKenar = giris.nextInt();
		System.out.println("Dikd�rtgenin Alan�: " 
		+kisaKenar * uzunKenar);
		System.out.println("Dikd�rtgenin �evresi: " 
				+2*(kisaKenar +uzunKenar));
		giris.close();
	}

}
