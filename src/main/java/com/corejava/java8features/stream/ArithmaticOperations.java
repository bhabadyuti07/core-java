package com.corejava.java8features.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArithmaticOperations implements PremitiveStreams {
	
	static int[] array = new int[] {2, 4, 56, 8, 0, 1};
	
	/*
	 * Find minimum value
	 */
	private static void findMinimumIntFromArray() {
		int min = Arrays.stream(array).min().getAsInt();
		System.out.println("Minimum value: "+min);
	}
	
	/*
	 * Find maximum value
	 */
	private static void findMaxValueFromArray() {
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("Max value: "+max);
	}
	
	/*
	 * Find sum
	 */
	private static void findSumOfAllValues() {
		int sum = Arrays.stream(array).sum();
		System.out.println("Sum is: "+sum);
	}
	
	
	

	public static void main(String[] args) {
		/*
		Arrays.stream(array).forEach(System.out::println);
		findMaxValueFromArray();
		findMinimumIntFromArray();
		findSumOfAllValues();*/
		
		
	}

	private static void createIntStreamRange() {
		IntStream.range(1, 5).forEach(System.out::println);
	}
	
}
