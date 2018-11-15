/**
 * 
 */
package com.corejava.basics;

import com.corejava.utility.Utility;

/**
 * @author Bhabadyuti Bal
 *
 */
public class ArraysUnionIntersection {
	
	
	
	public static void main(String[] args) {
		int[] array1 = new int[] {2,3,4,5,6,7,22,32,9,0};
		int[] array2 = new int[] {21,3,4,5,6,7,2,32,9,10};
		
		getCommonElements(array1, array2);
		getUnionedUniqueElements(array1, array2);
	}

	private static void getUnionedUniqueElements(int[] array1, int[] array2) {
		int i=0, j=0;
		int[] array3 = new int[array1.length + array2.length];
		for (int k = 0; k < array1.length; k++) {
			array3[k] = array1[k];
		}
		for (int k = 0; k < array2.length; k++) {
			if(!isElementPresentInFirstArray(array1, array2[k]))
				array3[k+array1.length] = array2[k];
		}
		Utility.printIntegerArray(array3);
		
	}

	private static boolean isElementPresentInFirstArray(int[] array1, int i) {
		for (int j = 0; j < array1.length; j++) {
			if (i == array1[j])
				return true;
		}
		return false;
	}

	private static void getCommonElements(int[] array1, int[] array2) {
		
		
	}

}
