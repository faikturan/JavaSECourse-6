package com.faikturan.core;

import java.util.Scanner;

public class Sample014 {

	public static void main(String[] args) {
		//if - else if -else, switch-case
//		String adi ="veli";
//		if (adi == "ali") {
//			System.out.println("Ali ad� bulundu.");
//		}else {
//			System.out.println("Ali ad� bulunamad�");
//		}
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("L�tfen Ya��n�z� Giriniz: ");
//		String yasi = oku.nextLine();
//		
//		if (yasi.equals("10")) {
//			System.out.println("Sen �ocuksun...");
//		}
//		
//		if (yasi.equals("20")) {
//			System.out.println("Sen Gen�sin...");
//		}
//		
//		if (yasi.equals("30")) {
//			System.out.println("Sen Yeti�kin....");
//		}
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("L�tfen Ya��n�z� Giriniz: ");
//		int yasi = oku.nextInt();
//		if (yasi >= 10 && yasi<=20) {
//			System.out.println("Sen �ocuksun...");
//		}else if (yasi >= 21 && yasi<=30) {
//			System.out.println("Sen Gen�sin...");
//		}else if (yasi >= 31 && yasi<=40) {
//			System.out.println("Sen Yeti�kin...");
//		}else if (yasi >= 41 && yasi<=60) {
//			System.out.println("Sen Olgunsun...");
//		}else {
//			System.out.println("Sen Daima Gen�sin...");
//		}
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("L�tfen G�n Giriniz: ");
//		String gun = oku.nextLine();
//		switch (gun) {
//		case "pazartesi":
//			System.out.println("G�n bulundu pazartesi.");
//			break;
//		case "sal�":
//			System.out.println("G�n bulundu sal�.");
//			break;
//		case "�ar�amba":
//			System.out.println("G�n bulundu �ar�am.");
//			break;
//		default:
//			System.out.println("G�n bulunamad�...");
//			break;
//		}
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("B�l�m giriniz: ");
//		String bolum = scn.nextLine();
//		System.out.println("S�n�f giriniz: ");
//		int sinif = scn.nextInt();
//		if(bolum.toLowerCase().endsWith("m�hendisli�i") &&
//				sinif == 3)
//		System.out.println("M�hendis ve 3. s�n�f");
//		else if(bolum.toLowerCase().endsWith("m�hendisli�i")||
//				sinif == 3)
//		System.out.println("M�hendis olmasa da 3. s�n�f");
//		else
//		System.out.println("Sen hi�bir �eysin...");
//		
		Scanner input = new Scanner(System.in);
		System.out.println("Ya��n�z� giriniz: ");
		int yas = input.nextInt();
		System.out.println("S�n�f�n�z� giriniz: ");
		int sinif = input.nextInt();
		if(yas <= 18 && (sinif == 1 || sinif == 2))
		System.out.println("KABUL");
		else if(yas > 18 && (sinif == 3 || sinif == 4))
		System.out.println("KABUL");
		else
		System.out.println("RED");
	}

}
