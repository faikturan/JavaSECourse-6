package com.faikturan.diziler;

import java.util.Iterator;

public class Diziler {

	public static void main(String[] args) {
		int sayi1;
		int sayi2;
		int sayi3;
		int sayi4;
		
		int[] sayiDizisi = null;
		//sayiDizisi[5]=8;
		
		sayiDizisi = new int[200];
		
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.println(sayiDizisi[i] = i);
		}

		System.out.println(sayiDizisi.length);
		
		double[] myList = new double[1000];
		
		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[3] = 15.65;
		myList[4] = 22.33;
		myList[5] = 55.44;
		myList[6] = 11.11;
		
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		boolean[] booleanDizisi = new boolean[500];
		
		double[] benimListem = {1.9, 2.9, 3.4, 3.5};
		
		for (int i = 0; i < benimListem.length; i++) {
			System.out.println(benimListem[i]);
		}
	}

}
