package com.corejava.basics;

import com.corejava.utility.Utility;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int array[] = new int[] {2, 3, 4, 5, 6};
		reverse(array);
		
		
	}

	private static void reverse(int[] array) {
		int length = array.length;
		int output[] = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = array[length - (i + 1)];
		}
		Utility.printIntegerArray(output);
	}

}
