package com.corejava.java8features.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int[] someNumbers = {1, 3, 5, 7, 8};
		int key = 0;
		
		process(someNumbers, key, (k, v) -> System.out.println(k / v));
		
	}
	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}

}
