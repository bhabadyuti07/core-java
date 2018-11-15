package com.corejava.sorting;

public interface CoreSorting {
	
	
	
	static boolean isSortedInAscending(int[] array) {
		boolean isSorted = true;
		for (int i = 1; i < array.length; i++) {
			if(array[i - 1] > array[i]) {
				isSorted = false;
			}
		}
		return isSorted;
	}

}
