package com.faikturan.diziler;

import java.util.Scanner;

public class Diziler3 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		final int DIZI_UZUNLUGU = 2;
		int[] dizi = new int[DIZI_UZUNLUGU];
		
//		System.out.println("Dizi Boyutunu Giriniz: ");
//		int[] dizi = new int[klavye.nextInt()];
//		System.out.println("Lütfen " +dizi.length +
//				" tane sayý giriniz:  ");
//		for (int i = 0; i < dizi.length; i++) {
//			dizi[i] = klavye.nextInt();
//		}
//
//		System.out.println("Girilen Dizi Elemanlarý: ");
//		for (int j = 0; j < dizi.length; j++) {
//			System.out.println(dizi[j]);
//		}
		
		dizi = new int[10];
		
		diziyiRassalSayilarlaDoldur(dizi);
		
		diziElemanlariniYazdir(dizi);
		
		System.out.println();
		char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		System.out.println(city);
		
		String str = "Dallas";
		System.out.println(str);
		
		int toplam = dizininToplaminiBul(dizi);
		System.out.println("Dizi elemanlarýnýn toplamý: " +toplam);
		
		//Dizinin en büyük elemanýný bulun.
		//en büyük elemanýn indeksini bulun.
		int enBuyukEleman = 0;
		int enBuyukElemaninIndeksi = -1;
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukEleman < dizi[i]) {
				enBuyukEleman = dizi[i];
				enBuyukElemaninIndeksi = i;
			}
		}
		System.out.println("Dizideki en büyük eleman: " +
		enBuyukEleman + " dir.");
		System.out.println("Dizideki en büyük elemanýn indeksi: "+
		enBuyukElemaninIndeksi +" dir.");
		
		for (int i = 0; i < dizi.length; i++) {
			int rassalIndeks = (int) (Math.random() * dizi.length);
			
			int gecici = dizi[i];
			dizi[i] = dizi[rassalIndeks];
			dizi[rassalIndeks] = gecici;
		}
		
		diziElemanlariniYazdir(dizi);
		
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length-1; i++) {
			dizi[i] = dizi[i+1];
		}
		dizi[dizi.length-1]=ilkEleman;
		
		System.out.println("\n---------------------------");
		diziElemanlariniYazdir(dizi);
	}

	private static int dizininToplaminiBul(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		return toplam;
	}

	private static void diziElemanlariniYazdir(int[] dizi) {
		//dizi elemanlarýný yazdýralým
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%4d", dizi[i]);
		}
	}

	private static void diziyiRassalSayilarlaDoldur(int[] dizi) {
		//diziyi sayýsal elemanlar ile dolduralým
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
	}
}
