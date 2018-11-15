/**
 * 
 */
package com.corejava.algo;

/**
 * @author Bhabadyuti Bal
 *
 */
public class LinearSearch {
	
	public static void main(String[] args) {
		boolean elementFound = false;
		int searchedElement = 7;
		int arr[] = new int[] {2, 4, 5, 19, 6, 36, 21, 41, 51, 19, 16, 36, 17, 7};
		long start = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchedElement) {
				System.out.println("Element found at index: "+i);
				elementFound = true;
				break;
			} 
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end - start));
		if(elementFound == false) {
			System.out.println("Searched element not found...");
		}
	}

}
