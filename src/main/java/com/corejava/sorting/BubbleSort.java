package com.corejava.sorting;

import com.corejava.utility.Utility;

public class BubbleSort implements CoreSorting {
	
	
	public static void main(String atgs[]) {
		int beforeSorting[] = {2, 4, 1, 54, 66, 74, 78, 90, 125};
		boolean sortedInAscending = CoreSorting.isSortedInAscending(beforeSorting);
		if (!sortedInAscending) {
			bubbleSort(beforeSorting);
		} else {
			System.out.println("Already sorted...");
		}
	}

	private static void bubbleSort(int[] beforeSorting) {
		
		for (int i = 0; i < beforeSorting.length - 1; i++) {
			for (int j = 1; j < beforeSorting.length - 1; j++) {
				if(beforeSorting[j-1] > beforeSorting[j]) {
					int temp = beforeSorting[j];
					beforeSorting[j] = beforeSorting[j-1];
					beforeSorting[j-1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting: " );
		Utility.printIntegerArray(beforeSorting);
		
	}
	
}
