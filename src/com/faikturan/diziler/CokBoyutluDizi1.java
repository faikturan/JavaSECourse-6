package com.faikturan.diziler;

import java.util.Scanner;

public class CokBoyutluDizi1 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int[][] satisTablosu = new int[3][2];
		
		System.out.println("Satis [0,0]= ");
		satisTablosu[0][0] = giris.nextInt();
		
		System.out.println("Satis [0,1]= ");
		satisTablosu[0][1] = giris.nextInt();
		
		System.out.println("Satis [1,0]= ");
		satisTablosu[1][0] = giris.nextInt();
		
		System.out.println("Satis [1,1]= ");
		satisTablosu[1][1] = giris.nextInt();
		
		System.out.println("Satis [2,0]= ");
		satisTablosu[2][0] = giris.nextInt();
		
		System.out.println("Satis [2,1]= ");
		satisTablosu[2][1] = giris.nextInt();
		
		System.out.println("Satis tablonuz");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 1; j++) {
				System.out.print(satisTablosu[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
