/**
 * 
 */
package com.corejava.others;

/**
 * @author Bhabadyuti Bal
 *
 */
public class BinarySearch {
	
	public int binarySearch (int[] arr, int searchElement) {
		int index = 0;
		if (arr != null) {
			//step 1: divide the array into 2 halves and compare the searched element with the middle element
			int start = 0;
			int end = 0;
			int middle = (start + end) / 2 ;
			if (middle == searchElement) {
				return arr[middle];
			} else {
				if (searchElement > middle) {
					start = middle + 1;
					index = search (arr, start, end, searchElement);
				} else {
					end = middle - 1;
					index = search (arr, start, end, searchElement);
				}
			}
		}
		return index;
	}
	
	
	private int search(int[] arr, int start, int end, int searchElement) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static void main(String[] args) {
		
	}

}
