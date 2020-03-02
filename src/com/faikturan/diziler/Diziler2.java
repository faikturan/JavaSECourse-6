package com.faikturan.diziler;

import java.util.Scanner;

public class Diziler2 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		final int DIZI_UZUNLUGU = 2;
		int[] dizi = new int[DIZI_UZUNLUGU];
		
//		System.out.println("Dizi Boyutunu Giriniz: ");
//		int[] dizi = new int[klavye.nextInt()];
//		System.out.println("L�tfen " +dizi.length +
//				" tane say� giriniz:  ");
//		for (int i = 0; i < dizi.length; i++) {
//			dizi[i] = klavye.nextInt();
//		}
//
//		System.out.println("Girilen Dizi Elemanlar�: ");
//		for (int j = 0; j < dizi.length; j++) {
//			System.out.println(dizi[j]);
//		}
		
		dizi = new int[10];
		
		//diziyi say�sal elemanlar ile doldural�m
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
		
		//dizi elemanlar�n� yazd�ral�m
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%-4d", dizi[i]);
		}
		
		System.out.println();
		char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		System.out.println(city);
		
		String str = "Dallas";
		System.out.println(str);
		
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println("Dizi elemanlar�n�n toplam�: " +toplam);
		
		//Dizinin en b�y�k eleman�n� bulun.
		//en b�y�k eleman�n indeksini bulun.
		int enBuyukEleman = 0;
		int enBuyukElemaninIndeksi = -1;
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukEleman < dizi[i]) {
				enBuyukEleman = dizi[i];
				enBuyukElemaninIndeksi = i;
			}
		}
		System.out.println("Dizideki en b�y�k eleman: " +
		enBuyukEleman + " dir.");
		System.out.println("Dizideki en b�y�k eleman�n indeksi: "+
		enBuyukElemaninIndeksi +" dir.");
		
		for (int i = 0; i < dizi.length; i++) {
			int rassalIndeks = (int) (Math.random() * dizi.length);
			
			int gecici = dizi[i];
			dizi[i] = dizi[rassalIndeks];
			dizi[rassalIndeks] = gecici;
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%4d", dizi[i]);
		}
		
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length-1; i++) {
			dizi[i] = dizi[i+1];
		}
		dizi[dizi.length-1]=ilkEleman;
		
		System.out.println("\n---------------------------");
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%4d", dizi[i]);
		}
	}
}
