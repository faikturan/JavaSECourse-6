package com.faikturan.core;

import java.util.Scanner;

public class Sample013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen ad�n�z� giriniz: ");
		String adi = sc.nextLine();
		System.out.println("L�tfen soyad�n�z� giriniz: ");
		String soyadi = sc.nextLine();
		
		String yaz = "Ad�: " + adi + " Soyad�: " +soyadi;
		System.out.println(yaz);
		

	}

}
