package com.faikturan.core;

import java.io.IOException;

public class Sample029 {

	public static void main(String[] args) throws IOException {
		/*
		 * Ana Menüye Hoþgeldiniz
		 * 1-Güncel
		 * 2-Havale Yap
		 * 3-Kontor Gönder
		 * 4-Hesap Aç
		 * 5-Limitleri Gör
		 * Lütfen bir menü seçiniz klavyeden
		 */
		char secilen;
		do {
			System.out.println("Ana Menüye Hoþgeldiniz:");
			System.out.println("                  1-Güncel");
			System.out.println("                  2-Havale Yap");
			System.out.println("                  3-Kontör Gönder");
			System.out.println("                  4-Hesap Aç");
			System.out.println("                  5-Limitleri Gör");
			System.out.println("Lütfen bir menü seçiniz:");
			secilen = (char) System.in.read();
		} while (secilen < '1' || secilen > '5');
		
		System.out.println("\n");

		switch (secilen) {
		case '1':
			System.out.println("Güncel menüsü seçildi.");
			break;
		case '2':
			System.out.println("Havale Yap menüsü seçildi.");
			break;
		case '3':
			System.out.println("Kontör Gönder menüsü seçildi.");
			break;
		case '4':
			System.out.println("Hesap Aç menüsü seçildi.");
			break;
		case '5':
			System.out.println("Limitleri Gör menüsü seçildi.");
			break;

		default:
			System.out.println("Geçersiz Menü seçtiniz...");
			break;
		}
	}
}
