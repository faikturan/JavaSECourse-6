package com.faikturan.core;

import java.util.Scanner;

public class Sample014 {

	public static void main(String[] args) {
		//if - else if -else, switch-case
//		String adi ="veli";
//		if (adi == "ali") {
//			System.out.println("Ali adý bulundu.");
//		}else {
//			System.out.println("Ali adý bulunamadý");
//		}
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("Lütfen Yaþýnýzý Giriniz: ");
//		String yasi = oku.nextLine();
//		
//		if (yasi.equals("10")) {
//			System.out.println("Sen Çocuksun...");
//		}
//		
//		if (yasi.equals("20")) {
//			System.out.println("Sen Gençsin...");
//		}
//		
//		if (yasi.equals("30")) {
//			System.out.println("Sen Yetiþkin....");
//		}
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("Lütfen Yaþýnýzý Giriniz: ");
//		int yasi = oku.nextInt();
//		if (yasi >= 10 && yasi<=20) {
//			System.out.println("Sen Çocuksun...");
//		}else if (yasi >= 21 && yasi<=30) {
//			System.out.println("Sen Gençsin...");
//		}else if (yasi >= 31 && yasi<=40) {
//			System.out.println("Sen Yetiþkin...");
//		}else if (yasi >= 41 && yasi<=60) {
//			System.out.println("Sen Olgunsun...");
//		}else {
//			System.out.println("Sen Daima Gençsin...");
//		}
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("Lütfen Gün Giriniz: ");
//		String gun = oku.nextLine();
//		switch (gun) {
//		case "pazartesi":
//			System.out.println("Gün bulundu pazartesi.");
//			break;
//		case "salý":
//			System.out.println("Gün bulundu salý.");
//			break;
//		case "çarþamba":
//			System.out.println("Gün bulundu çarþam.");
//			break;
//		default:
//			System.out.println("Gün bulunamadý...");
//			break;
//		}
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Bölüm giriniz: ");
//		String bolum = scn.nextLine();
//		System.out.println("Sýnýf giriniz: ");
//		int sinif = scn.nextInt();
//		if(bolum.toLowerCase().endsWith("mühendisliði") &&
//				sinif == 3)
//		System.out.println("Mühendis ve 3. sýnýf");
//		else if(bolum.toLowerCase().endsWith("mühendisliði")||
//				sinif == 3)
//		System.out.println("Mühendis olmasa da 3. sýnýf");
//		else
//		System.out.println("Sen hiçbir þeysin...");
//		
		Scanner input = new Scanner(System.in);
		System.out.println("Yaþýnýzý giriniz: ");
		int yas = input.nextInt();
		System.out.println("Sýnýfýnýzý giriniz: ");
		int sinif = input.nextInt();
		if(yas <= 18 && (sinif == 1 || sinif == 2))
		System.out.println("KABUL");
		else if(yas > 18 && (sinif == 3 || sinif == 4))
		System.out.println("KABUL");
		else
		System.out.println("RED");
	}

}
