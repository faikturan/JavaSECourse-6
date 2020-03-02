package com.faikturan.core;

import java.util.Random;
import java.util.Scanner;

public class Sample015 {

	public static void main(String[] args) {
		Random random = new Random();
		double bakiye = (double)random.nextInt(2000);
		double cekilecek = 0;
		double limit = 500;
		System.out.println("Þu andaki bakiyeniz: " +bakiye);
		System.out.println("Lütfen çekmek istediðiniz "
				+ "miktari giriniz: ");
		Scanner s = new Scanner(System.in);
		cekilecek = s.nextDouble();
		if (cekilecek <= bakiye && cekilecek <= limit) {
			bakiye = bakiye - cekilecek;
			System.out.println("Çekilen Para Miktari: " 
			+cekilecek);
			System.out.println("Kalan Para Miktari: " +bakiye);
		} else {
			if (cekilecek > bakiye) {
				System.out.println("Hesabýnýzda yeterli "
						+ "bakiye yok!!!");
			}
			if (cekilecek > limit) {
				System.out.println("Çekmek istediðiniz miktar"
						+ " iþlem limitinizden fazla.");
			}
		}
		
		
	}

}
