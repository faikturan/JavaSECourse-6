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
		System.out.println("��karma Sonucu: " +birinciSayi+ 
				"-" + ikinciSayi + " =" +sonuc);
		
		sonuc = birinciSayi * ikinciSayi;
		System.out.println("�arpma Sonucu: " +birinciSayi+ 
				"*" + ikinciSayi + " =" +sonuc);
		
		sonuc = birinciSayi / ikinciSayi;
		System.out.println("B�lme Sonucu: " +birinciSayi+ 
				"/" + ikinciSayi + " =" +sonuc);
		
		sonuc = birinciSayi % ikinciSayi;
		System.out.println("Kalan ��lemi Sonucu: " +birinciSayi+ 
				"%" + ikinciSayi + " =" +sonuc);

	}

}
