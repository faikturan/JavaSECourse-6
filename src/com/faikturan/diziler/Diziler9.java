package com.faikturan.diziler;

import java.util.Scanner;

public class Diziler9 {

	public static void main(String[] args) {
		String[] gunler = {"Pazartesi", "Sal�", "�ar�amba", "Per�embe", "Cuma",
				"Cumartesi", "Pazar"};
		
		System.out.println("Haftan�n belirli bir g�n�n� bulmak i�in "
				+ "1'den 7'ye kadar bir say� giriniz:");
		Scanner klavye = new Scanner(System.in);
		int secim = klavye.nextInt();
		System.out.println("Se�ti�iniz g�n: " + gunler[secim - 1]);
		}

}
