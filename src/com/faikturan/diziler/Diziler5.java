package com.faikturan.diziler;

import java.util.Scanner;

public class Diziler5 {
	private static final Scanner giris = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Dizinin boyutunu giriniz=>");
		final int boyut = giris.nextInt();
		
		System.out.println("Dizi elemanlarýný giriniz: ");
		
		int[] dizi = new int[boyut];
		
		for (int i = 0; i < boyut; i++) {
			dizi[i] = giris.nextInt();
		}
		
		int toplam = getToplam(dizi);
		System.out.println("Toplam = " +toplam);
		
		double ortalama = toplam / boyut;
		System.out.println("Ortalama = " +ortalama);
		
		ortalamaninUstundekiElemanlariBul(dizi, ortalama);
		
	}

	private static void ortalamaninUstundekiElemanlariBul(int[] dizi, double ortalama) {
		int sayac = 0;
		for (int e : dizi) {
			if (e > ortalama) {
				++sayac;
			}
		}
		System.out.println("Ortalamanýn üstündeki eleman sayýsý: "+sayac);
	}

	private static int getToplam(int[] dizi) {
		int toplam = 0;
		for (int e : dizi) {
			toplam += e;
		}
		return toplam;
	}

}
