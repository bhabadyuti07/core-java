package com.corejava.utility;

import java.util.List;

public class Utility {

	public static void printIntegerArray(int array[]) {
		System.out.println("Output Array...");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static int[] stringToArray(String input) {
		String[] split = input.split(",");
		int[] array = new int[split.length];
		System.out.println("Array Length: " + array.length);
		for (int i = 0; i < split.length; i++) {
			array[i] = Integer.parseInt(split[i]);
		}

		return array;
	}

	public static void main(String[] args) {
		List<String> list = null;
		//System.out.println(list.isEmpty());
	}

}
