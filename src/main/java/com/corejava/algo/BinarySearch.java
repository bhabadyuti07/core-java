/**
 * 
 */
package com.corejava.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bhabadyuti Bal
 * 
 * TimeComplexity : O(log n)
 *
 */
public class BinarySearch {
	
	static int comparisions = 0;
	
	
	public static int runBinarySearchIteratively(int[] sortedArray, int searchedElement, int startIndex, int endIndex){
		System.out.println("runBinarySearchIteratively called...");
		int index = -1;
		
		while(startIndex <= endIndex) {
			int mid = ( startIndex + endIndex ) / 2;
			if(searchedElement > sortedArray[mid]) {
				startIndex = mid + 1;
			} else if (searchedElement < sortedArray[mid]) {
				endIndex = mid - 1;
			} else if (sortedArray[mid] == searchedElement) {
				index = mid;
				break;
			}
			
		}
		return index;
	}
	
	
	public static int runBinarySearchUsingJavaArrays(int[] sortedArray, int searchedElement){
		int index = Arrays.binarySearch(sortedArray, searchedElement);
		return index;
	}
	
	
	public static int runBinarySearchUsingCollection(int[] sortedArray, int searchedElement){
		List<Integer> sortedList = Arrays.stream(sortedArray).boxed().sorted().collect(Collectors.toList());
		int index = Collections.binarySearch(sortedList, searchedElement);
		return index;
	}
	
	
	
	public static int runBinarySearchRecursively(int[] array, int searchedElement, int start, int end) {
		comparisions = comparisions + 1;
		System.out.println("Comparisions count: "+comparisions);
		int middle = (start + end) / 2;
		int index = -1;
		if (searchedElement == array[middle]) {
			index = middle;
			return index;
		} else if(searchedElement > array[middle]){
			//search element is in right half
			start = middle + 1;
			index = runBinarySearchRecursively(array, searchedElement, start, end);
			return index;
		} else if (searchedElement < array[middle]) {
			//search element in right half
			end = middle - 1;
			index = runBinarySearchRecursively(array, searchedElement, start, end);
			return index;
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		int searchedElement = 4;
		int startIndex = 0;
		int lastIndex = array.length;
		//int index = runBinarySearchRecursively(array, searchedElement, startIndex, lastIndex);
		//int index = runBinarySearchIteratively(array, searchedElement, startIndex, lastIndex);
		int index = runBinarySearchUsingCollection(array, searchedElement);
		if (index != -1) {
			System.out.println("Index of searched element is :"+index);
		} else {
			System.out.println("Element not found :(");
		}
	}

}
