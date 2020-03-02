package com.faikturan.diziler;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Diziler8 {
	
	private static final int QUESTION_COUNT = 10;

	public static void main(String[] args) {
		
		char[] cevapAnahtari = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		showAnswers(cevapAnahtari);
		
		char[] answers = null;
		for (int i = 0; i < 8; i++) {
			answers = generateRandomAnswers();
			System.out.printf("%d. student = %s\n", i + 1, Arrays.toString(answers));
			showNumberOfCorrect(cevapAnahtari, answers);
		}
	}

	private static void showNumberOfCorrect(char[] answerKey, char[] answers) {
		int counter = 0;
		
		for (int i = 0; i < QUESTION_COUNT; i++) {
			if (answers[i] == answerKey[i]) {
				++counter;
			}
		}
		System.out.println("Number of corrects = " + counter);
		System.out.println("Number of incorrects = " + (QUESTION_COUNT - counter));
	}

	private static char[] generateRandomAnswers() {
		char[] answers = new char[QUESTION_COUNT];
		char[] validAnswers = {'A', 'B', 'C', 'D', 'E'};
		Random random = new Random(new Date().getTime());
		
		for (int i = 0; i < QUESTION_COUNT; i++) {
			answers[i] = validAnswers[random.nextInt(5)];
		}
		return answers;
	}

	private static void showAnswers(char[] answers) {
		System.out.println(Arrays.toString(answers));
	}

}
