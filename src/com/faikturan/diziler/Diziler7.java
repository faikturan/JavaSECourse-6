package com.faikturan.diziler;

public class Diziler7 {

	public static void main(String[] args) {
		char[] karakterdizisi = rassalDiziYarat();
		
		karakterDizisiniYazdir(karakterdizisi);
		
		int[] sayac = harfleriSay(karakterdizisi);
		
		sayaciYazdir(sayac);	
	}

	static void sayaciYazdir(int[] sayac) {
		for (int i = 0; i < sayac.length; i++) {
			System.out.print((char) ('a' + i) + ":" +
		sayac[i] + " ");
			if ((i + 1) % 10 == 0 ){
				System.out.println();
			}
		}
		
	}

	static int[] harfleriSay(char[] karakterdizisi) {
		int[] sayac = new int[26];
		for (int i = 0; i < karakterdizisi.length; i++) {
			sayac[karakterdizisi[i] - 'a']++;
		}
		return sayac;
	}

	static void karakterDizisiniYazdir(char[] karakterdizisi) {
		for (int i = 0; i < karakterdizisi.length; i++) {
			System.out.print(karakterdizisi[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		
	}

	static char[] rassalDiziYarat() {
		char[] dizi = new char[100];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rassalKarakterBul();
		}
		return dizi;
	}

	private static char rassalKarakterBul() {
		return (char) (Math.random() * 26 + 'a');
	}

}
