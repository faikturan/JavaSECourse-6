package com.faikturan.oop.v2;

public class Main {

	public static void main(String[] args) {
		Hesap faikHesap = new Hesap();
		System.out.println(faikHesap.getNumara());
		System.out.println(faikHesap.getBakiye());
		
		faikHesap.paraCekme(100.0);
		
		faikHesap.paraYatirma(50);
		faikHesap.paraCekme(100);
		
		faikHesap.paraYatirma(51);
		faikHesap.paraCekme(100);
		
		System.out.println("Banka İşlemleri Sonrası Bakiye: ");
		System.out.println(faikHesap.getBakiye());
		
		OzelMusteri musteri1 = new OzelMusteri();
		System.out.println(musteri1.getMusteriAd() + " " +musteri1.getKrediLimit());
		
		OzelMusteri musteri2 = new OzelMusteri("Sena", 100000.0);
		System.out.println(musteri2.getMusteriAd() + " " + musteri2.getKrediLimit());
		
		OzelMusteri musteri3 = new OzelMusteri("Talha", 500000.0, "talha@talha.com");
		System.out.println(musteri3.getMusteriAd() + " "+musteri3.getKrediLimit());

	}

}
