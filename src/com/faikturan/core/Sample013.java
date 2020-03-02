package com.faikturan.core;

import java.util.Scanner;

public class Sample013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen adýnýzý giriniz: ");
		String adi = sc.nextLine();
		System.out.println("Lütfen soyadýnýzý giriniz: ");
		String soyadi = sc.nextLine();
		
		String yaz = "Adý: " + adi + " Soyadý: " +soyadi;
		System.out.println(yaz);
		

	}

}
