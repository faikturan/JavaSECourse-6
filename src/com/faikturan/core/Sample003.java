package com.faikturan.core;

public class Sample003 {

	public static void main(String[] args) {
		/*
		 * int dýþýndaki tamsayý veritiplerinde elle 
		 * deger atadýgýmýzda
		 * bunlarý cast etmwemiz gerekir
		 */
		byte byteSayi = (byte)6;
		short shortSayi = (short)10;
		System.out.println("byteSayi= "+byteSayi);
		System.out.println("shortSayi= "+shortSayi);
		/*
		 * long deðiþkene elle deðer atadýðýmýzda
		 * sonuna L literalini eklememiz gerekiyor
		 * Aksi halde derleyici degeri int algýlar.
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
		System.out.println("geciciInt Yeni Deðer: " +geciciInt);
		
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
