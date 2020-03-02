package com.faikturan.core;

public class Sample021 {

	public static void main(String[] args) throws InterruptedException {
		do {
			System.out.println("Start Processing inside "
					+ "do while loop");
			System.out.println("End Processing of "
					+ "do while loop");
			
			Thread.sleep(5*1000);
			
		} while (true);
	}

}
