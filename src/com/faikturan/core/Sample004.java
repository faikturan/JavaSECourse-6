package com.faikturan.core;

public class Sample004 {

	public static void main(String[] args) {
		// Tür dönüþümleri
		String sayi = "30";
		int dyas = Integer.valueOf(sayi);
		int carp = dyas * 3;
		System.out.println("Çarp Sonucu: " +carp);
		
		String sayi2 = "15.6";
		double d1 = Double.valueOf(sayi2);
		System.out.println("Double Sonucu: " + (d1 + 10.5));
		
		float f1 = 10.9f;
		float f2 = 15.8f;
		int topla = (int) (f1 + f2);
		System.out.println("Float Sonucu: " +topla);
		
		char c = '9';
		int dc = (int)c;
		System.out.println("Int Sonucu: " +dc);
		int gdc = Integer.valueOf(String.valueOf(c));
		System.out.println("Gerçek Dönüþüm: " +gdc);
		char x = 'a';
		System.out.println(String.valueOf(x));
		
		
		

	}

}
