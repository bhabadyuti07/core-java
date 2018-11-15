package com.corejava.java8features.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeOperations {
	
	
	public static void main(String[] args) {
		createIntStreamRange();
	}

	/*
	 * There’re times when we need to convert primitive values to their wrapper equivalents.
	 *	In those cases, we can use the boxed() method:
	 */
	private static void createIntStreamRange() {
		List<Integer> list = IntStream.range(1, 5)
							.filter(i -> i % 2 == 0)
							.boxed()
							.collect(Collectors.toList());
		System.out.println("Even numbers between 1 to 5: "+list);
	}
	

}
