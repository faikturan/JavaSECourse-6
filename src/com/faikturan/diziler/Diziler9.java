package com.faikturan.diziler;

import java.util.Scanner;

public class Diziler9 {

	public static void main(String[] args) {
		String[] gunler = {"Pazartesi", "Salý", "Çarþamba", "Perþembe", "Cuma",
				"Cumartesi", "Pazar"};
		
		System.out.println("Haftanýn belirli bir gününü bulmak için "
				+ "1'den 7'ye kadar bir sayý giriniz:");
		Scanner klavye = new Scanner(System.in);
		int secim = klavye.nextInt();
		System.out.println("Seçtiðiniz gün: " + gunler[secim - 1]);
		}

}
