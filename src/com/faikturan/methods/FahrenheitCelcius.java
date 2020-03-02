package com.faikturan.methods;

import java.util.Scanner;

public class FahrenheitCelcius {

	public static void main(String[] args) throws InterruptedException {
		Scanner scn = new Scanner(System.in);
		int cel = 0;
		int fah = 0;
		
		System.out.println("1-Celcius -> Fahrenheit");
		System.out.println("2-Fahrenheit -> Celsius");
		System.out.println("Lütfen yapmak istediðiniz dönüþümü yazýnýz.");
		int secim = scn.nextInt();
		
		if (secim == 1) {
			System.out.println("Lütfen Celsius cinsinden degeri giriniz: ");
			cel = scn.nextInt();
			Thread.sleep(1000);
			System.out.println("Dönüþüm Yapýlýyor....");
			System.out.println(cel + " Celsius = " +cf(cel) + " Fahrenheit ");
		}else if(secim == 2) {
			System.out.println("Lütfen Fahrenheit cinsinden degeri giriniz: ");
			cel = scn.nextInt();
			Thread.sleep(1000);
			System.out.println("Dönüþüm Yapýlýyor....");
			System.out.println(fah + " Fahrenheit = " +fc(fah) + " Celsius ");
		}else {
			System.out.println("Lütfen geçerli bir menu seçiniz...");
		}
			
	}
	
	private static int fc(int fah) {
		int f = fah;
		int c = 0;
		
		c = (int) ((f - 32)/1.8);
		return c;
	}
	
	private static int cf(int cel) {
		int c = cel;
		int f = 0;
		f = (int) ((c * 1.8)+32);
		return f;
	}

}
