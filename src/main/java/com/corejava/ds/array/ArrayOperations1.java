package com.corejava.ds.array;

import java.util.Scanner;

public class ArrayOperations1 {
	
	public static void main(String[] args) {
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int[] intArray = {2, 4, 5, 6, 7, 10};
		
		searchNearestElement(intArray, target);
	}

	private static void searchNearestElement(int[] array, int target) {
		int length = array.length;
		int startIndex = 0;
		int lastIndex = length - 1;
		int index = searchBinaryType(array, startIndex, lastIndex, target);
		if (index == -1) {
			System.out.println("Searched element not found");
		} else 
			System.out.println("Element is: "+array[index]);
	}
	
	
	private static int searchBinaryType(int[] array, int start, int end, int target) {
		int index = -1;
		int middle = (start + end) / 2;
		if (array[middle] == target) {
			return middle;
		} else {
			if(middle > 0) {
				if (target > array[middle] && target < array[middle + 1]) {
					// right half
					start = middle + 1;
					index = searchBinaryType(array, start, end, target);
				} else if (target < array[middle] && target > array[middle - 1]) {
					// left half
					end = middle - 1;
					index = searchBinaryType(array, start, end, target);
				}
			}
			
		}
		return index;
	}

}
