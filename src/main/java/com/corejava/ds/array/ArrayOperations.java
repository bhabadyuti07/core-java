package com.corejava.ds.array;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.corejava.utility.Utility;

public class ArrayOperations {

	public static void insertElementToArray(int[] array, int position) {
		System.out.println("Insert element to insert:");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int[] newArray = new int[array.length + 1];
		if (0 == position) {
			// insert at first
			for (int i = 0; i < (newArray.length); i++) {
				if (i == position) {
					newArray[i] = element;
				} else {
					newArray[i] = array[i - 1];
				}
			}
			System.out.println("Inserted at first :)");
		} else if (position > 0 && position < newArray.length) {
			// insert at middle
			for (int i = 0; i < (newArray.length); i++) {
				if (i == position) {
					newArray[i] = element;
				} else if (i < position) {
					newArray[i] = array[i];
				} else {
					newArray[i] = array[i - 1];
				}
			}
			System.out.println("Inserted at middle :)");
		} else {
			// insert at last
			for (int i = 0; i < (newArray.length); i++) {
				if (i == position) {
					newArray[i] = element;
				} else {
					newArray[i] = array[i];
				}
			}
			System.out.println("Inserted at last :)");
		}

		Utility.printIntegerArray(newArray);
	}

	public static void deleteElementFromArray(int[] array) {
		System.out.println("Insert element to delete:");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		array[0] = 0;
	}

	public static void main(String[] args) {
		System.out.println("Insert comma separated array values:");
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		if (nextLine != null) {
			int[] array = Utility.stringToArray(nextLine);
			int start = 0;
			int end = array.length;
			int middle = (start + end) / 2;
			insertElementToArray(array, start);
			//free the array
			array = null;
			System.out.println();
		} else {
			throw new NoSuchElementException("Where the heaven the input is ?????");
		}
	}

}
