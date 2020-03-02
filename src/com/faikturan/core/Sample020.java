package com.faikturan.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample020 {

	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add("Ispanak");
		s.add("Patates");
		s.add("Domates");
		
		Iterator<String> it = s.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
