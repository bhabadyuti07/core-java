/**
 * 
 */
package com.corejava.sorting;

import com.corejava.utility.Utility;

/*
 * Insertion Sort - 
 * 
 * TC worst case : O(n^2)
 *
 */
public class InsertionSort {
	
	
	public static void main(String[] args) {
		insertionSort(new int[]{4, 3, 1, 5});
	}

	private static void insertionSort(int[] array) {
		boolean isSorted = CoreSorting.isSortedInAscending(array);
		if(isSorted) {
			System.out.println("Already sorted...");
			return;
		}
		//IntStream sorted = Arrays.stream(array).sorted().;
		
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			while (i > 0 && temp < array[i - 1]) {
				array[i] = array[i-1];
				array[i-1] = temp;//temp will be inserted to 
				i--;
			}
		}
		Utility.printIntegerArray(array);
	}

}
