package com.faikturan.methods;

public class TestSureHesapla {

	public static void main(String[] args) {
		System.out.println(SureHesapla(65, 45));
		System.out.println(SureHesapla(8000L));
	
	}
	
	private static String SureHesapla(long dakika, long saniye) {
		if ((dakika < 0)||(saniye < 0)||(saniye >59)) {
			return "Geçersiz Deðer";
		}
		long saat = dakika / 60;
		long kalanDakika = dakika % 60;
		return saat + " saat " + kalanDakika + " dakika "+ saniye + " saniye";
		
	}
	
	private static String SureHesapla(long saniye) {
		if (saniye < 0) {
			return "Geçersiz Deðer";
		}
		long dakika = saniye / 60;
		long kalanSaniye = saniye % 60;
		return SureHesapla(dakika, kalanSaniye);
		
	}
	

}
