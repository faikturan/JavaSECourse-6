package com.faikturan.core;

import java.util.Random;
import java.util.Scanner;

public class Sample015 {

	public static void main(String[] args) {
		Random random = new Random();
		double bakiye = (double)random.nextInt(2000);
		double cekilecek = 0;
		double limit = 500;
		System.out.println("�u andaki bakiyeniz: " +bakiye);
		System.out.println("L�tfen �ekmek istedi�iniz "
				+ "miktari giriniz: ");
		Scanner s = new Scanner(System.in);
		cekilecek = s.nextDouble();
		if (cekilecek <= bakiye && cekilecek <= limit) {
			bakiye = bakiye - cekilecek;
			System.out.println("�ekilen Para Miktari: " 
			+cekilecek);
			System.out.println("Kalan Para Miktari: " +bakiye);
		} else {
			if (cekilecek > bakiye) {
				System.out.println("Hesab�n�zda yeterli "
						+ "bakiye yok!!!");
			}
			if (cekilecek > limit) {
				System.out.println("�ekmek istedi�iniz miktar"
						+ " i�lem limitinizden fazla.");
			}
		}
		
		
	}

}
