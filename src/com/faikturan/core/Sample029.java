package com.faikturan.core;

import java.io.IOException;

public class Sample029 {

	public static void main(String[] args) throws IOException {
		/*
		 * Ana Men�ye Ho�geldiniz
		 * 1-G�ncel
		 * 2-Havale Yap
		 * 3-Kontor G�nder
		 * 4-Hesap A�
		 * 5-Limitleri G�r
		 * L�tfen bir men� se�iniz klavyeden
		 */
		char secilen;
		do {
			System.out.println("Ana Men�ye Ho�geldiniz:");
			System.out.println("                  1-G�ncel");
			System.out.println("                  2-Havale Yap");
			System.out.println("                  3-Kont�r G�nder");
			System.out.println("                  4-Hesap A�");
			System.out.println("                  5-Limitleri G�r");
			System.out.println("L�tfen bir men� se�iniz:");
			secilen = (char) System.in.read();
		} while (secilen < '1' || secilen > '5');
		
		System.out.println("\n");

		switch (secilen) {
		case '1':
			System.out.println("G�ncel men�s� se�ildi.");
			break;
		case '2':
			System.out.println("Havale Yap men�s� se�ildi.");
			break;
		case '3':
			System.out.println("Kont�r G�nder men�s� se�ildi.");
			break;
		case '4':
			System.out.println("Hesap A� men�s� se�ildi.");
			break;
		case '5':
			System.out.println("Limitleri G�r men�s� se�ildi.");
			break;

		default:
			System.out.println("Ge�ersiz Men� se�tiniz...");
			break;
		}
	}
}
