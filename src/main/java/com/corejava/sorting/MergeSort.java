package com.corejava.sorting;

import com.corejava.utility.Utility;

public class MergeSort {
	
	
	public static void main(String[] args) {
		
		int[] array = new int[]{2,3,1,5};
		int mid = array.length / 2;
		//array = mergeSort(array, 0, mid, array.length);
		Utility.printIntegerArray(array);
	}

	private static int[] mergeSort(int[] array, int left, int right) {/*
		if (array.length <= 1) {
			return array;
		} 
		right = (left + right) / 2;
		int length = array.length;
		//int[] leftArray = mergeSort(array);
		int[] rightArray = mergeSort(array, right, length);
		//int[] mergedArray = merge(leftArray, rightArray);*/
		return  null;
	}

	private static int[] merge(int[] array1, int[] array2) {
		int length1 = array1.length;
		int length2 = array2.length;
		int[] mergedArray = new int[length1 + length2];
		int i=0, j=0, k=0;
		
		while(i < length1 && j < length2) {
			if(array1[i] < array2[j]) {
				mergedArray[k++] = array1[i++];
			} else {
				mergedArray[k++] = array2[j++];
			}
		}
		
		while(i < length1) {
			mergedArray[k++] = array1[i++];
		}
		
		while(j < length2) {
			mergedArray[k++] = array2[j++];
		}
		
		return mergedArray;
		/*for (int k2 = 0; k2 < mergedArray.length; k2++) {
			System.out.print(mergedArray[k2]+" ");
		}*/
	}

}
