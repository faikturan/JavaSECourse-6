package com.faikturan.core;

public class Sample002 {

	public static void main(String[] args) {
		/*
		 * Degiskenler - 
		 * String Karakter
		 * Default degeri : null
		 */
		String adi = "Ali";
		String yasi = "30";
		String maasi = "3.500";
		System.out.println("Ad�: " + adi + "  Ya��: " +yasi +
				" Maa��: " + maasi);
		
		//Tamsay� veri t�rleri
		//default degeri :0

		int sayi1 = 10;
		int sayi2 = 20;
		int toplam  = sayi1 + sayi2;
		System.out.println("Sonu�: " + toplam);
		
		//Ondal�k say�sal birim 
		//double virg�lden sonra en fazla 16 haneye kadar 
		//8 byte
		double ondalikli1 = 15.6;
		double ondalikli2 = 3.9;
		double sonuc = ondalikli1 + ondalikli2;
		System.out.println("Ondal�kl� Sonu�: " +sonuc);
		
		//float veri t�r�
		//virg�lden sonra en fazla 8 haneye kadar
		//4 byte
		float f1 = (float) 10.5;
		float f2 = 10.5f;
		float f3 = f1 * f2;
		System.out.println("Float Sonucu: " +f3);
		
		//char veri t�r�
		//i�erisine sadece 1 karakter al�r.
		char c1 = '�';
		char c2 = 'S';
		char c3 = 'M';
		char c4 = 'E';
		char c5 = 'K';
		System.out.println(""+c1+c2+c3+c4+c5);
		
		
	}

}
