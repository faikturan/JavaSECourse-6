package com.faikturan.diziler;

import java.util.Scanner;

public class Diziler4 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir yazý giriniz: ");
		String yazi = klavye.nextLine();
		
		char[] yaziDizisi = yazi.toCharArray();
		char[] yazininTersi = terseCevir(yaziDizisi);
		
		System.out.println("Girdiðiniz yazýnýn tersi");
		System.out.println(yazininTersi);
	}

	private static char[] terseCevir(char[] yaziDizisi) {
		char[] yazininTersi = new char[yaziDizisi.length];
	for (int i = 0, j = yazininTersi.length-1; 
			i < yazininTersi.length; i++, j--) {
				yazininTersi[j] = yaziDizisi[i];
	}
		return yazininTersi;
	}

}
