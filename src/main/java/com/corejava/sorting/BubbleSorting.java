package com.corejava.sorting;

/*
 * Bubble Sort - 
 * 
 * TC worst case : O(n^2)
 * SC : 
 */

public class BubbleSorting {

	public static void main(String[] args) {
		int[] array = new int[] {2,5,7,54,9,1};
		printArray(array);
		sortElements(array);
		System.out.println();
		printArray(array);
	}

	private static void sortElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		
	}
	
}
