package com.faikturan.core;

public class Sample003 {

	public static void main(String[] args) {
		/*
		 * int d���ndaki tamsay� veritiplerinde elle 
		 * deger atad�g�m�zda
		 * bunlar� cast etmwemiz gerekir
		 */
		byte byteSayi = (byte)6;
		short shortSayi = (short)10;
		System.out.println("byteSayi= "+byteSayi);
		System.out.println("shortSayi= "+shortSayi);
		/*
		 * long de�i�kene elle de�er atad���m�zda
		 * sonuna L literalini eklememiz gerekiyor
		 * Aksi halde derleyici degeri int alg�lar.
		 */
		int intSayi = 32;
		long longSayi = 64L;
		System.out.println("intSayi= " +intSayi);
		System.out.println("longSayi= "+longSayi);
		
		int geciciInt = intSayi / 2;
		System.out.println("geciciInt= " + geciciInt);
		short geciciShort = (short) (shortSayi * 2);
		System.out.println("geciciShort = " +geciciShort);
		geciciInt = geciciInt + geciciShort;
		System.out.println("geciciInt Yeni De�er: " +geciciInt);
		
		float floatSayi = (float)12.1;
		float floatSayi2 = 12.1F;
		System.out.println("floatSayi = "+floatSayi);
		System.out.println("floatSayi2 = "+floatSayi2);
		
		char karakter = 'A';
		System.out.println("Karakter: " +karakter);
		
		boolean active = true;
		System.out.println(active);
		
		
	}

}
