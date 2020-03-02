package com.faikturan.diziler;

public class Diziler10 {

	public static void main(String[] args) {
		int b[] = {1, 2, 3, 4, 5};
		for (int i = b.length; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(b[j] + " ");
			}
			System.out.println();
		}

	}

}
