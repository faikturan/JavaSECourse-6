package com.faikturan.core;

public class Sample006 {

	public static void main(String[] args) {
		int birinciSayi = 4;
		int ikinciSayi = 8;
		int ucuncuSayi = 12;
		int sonuc;
		
		sonuc = (birinciSayi + ikinciSayi) * ucuncuSayi;
		System.out.println("Parantez Kullan�ld���nda Sonuc: " 
		+sonuc);

		sonuc = birinciSayi + ikinciSayi * ucuncuSayi;
		System.out.println("Parantez Kullan�lmad���nda Sonuc: " 
		+sonuc);

	}

}
