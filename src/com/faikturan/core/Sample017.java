package com.faikturan.core;

public class Sample017 {

	public static void main(String[] args) {
		/*
		 * while - do while - for
		 * 1 ile 100 aras�nda yer alan 3 ve 5 in ortak
		 * katlar�n� d�ng�lerle bulmak.
		 */

		System.out.println("�� ve Be�in Ortak Katlar�:");
		//int sayi = 0;
//		while (sayi <= 100) {
//			sayi++;
//			if (sayi % 15 != 0) {
//				continue;
//			}
//			System.out.println(sayi);
//		}
		
		
//		do {
//			sayi++;
//			if (sayi % 15 != 0) {
//				continue;
//			}
//			System.out.println(sayi);
//		} while (sayi <= 100);
		
		for (int sayi = 2; sayi <= 100; sayi++) {
			if (sayi % 15 != 0) {
				continue;
			}
			System.out.println(sayi);
		}
	}

	
}
