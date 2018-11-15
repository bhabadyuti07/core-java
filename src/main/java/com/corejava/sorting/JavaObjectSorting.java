/**
 * 
 */
package com.corejava.sorting;

import java.util.Arrays;

/**
 * @author Bhabadyuti Bal
 *
 */
public class JavaObjectSorting {

	public static void main(String[] args) {
		sortPrimitives();
	}

	private static void sortPrimitives() {
		//sort primitives array like int array
		System.out.println("");
		int[] intArray = {2, 19, 3, 1};
		Arrays.sort(intArray);
		System.out.println("Sorted Array: "+intArray);
		
		//sorting String array
		String[] strArray = {"A", "Y", "Z", "Q"};
		Arrays.sort(strArray);
		System.out.println("Sorted Array: "+strArray);
	}
}
