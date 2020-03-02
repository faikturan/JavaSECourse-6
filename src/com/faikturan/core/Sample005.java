package com.faikturan.core;

public class Sample005 {

	public static void main(String[] args) {
		int birinciSayi = 16;
		int ikinciSayi = 8;
		int sonuc;
		
		sonuc = birinciSayi + ikinciSayi;
		System.out.println("Toplama Sonucu: " +birinciSayi+ 
				"+" + ikinciSayi + " =" +sonuc);
	
		sonuc = birinciSayi - ikinciSayi;
		System.out.println("Çýkarma Sonucu: " +birinciSayi+ 
				"-" + ikinciSayi + " =" +sonuc);
		
		sonuc = birinciSayi * ikinciSayi;
		System.out.println("Çarpma Sonucu: " +birinciSayi+ 
				"*" + ikinciSayi + " =" +sonuc);
		
		sonuc = birinciSayi / ikinciSayi;
		System.out.println("Bölme Sonucu: " +birinciSayi+ 
				"/" + ikinciSayi + " =" +sonuc);
		
		sonuc = birinciSayi % ikinciSayi;
		System.out.println("Kalan Ýþlemi Sonucu: " +birinciSayi+ 
				"%" + ikinciSayi + " =" +sonuc);

	}

}
