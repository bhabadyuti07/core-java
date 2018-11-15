package com.corejava.string;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * In a space separated string check the sub string occurances 
 */
public class SubStringOccurancesJava7 {

	public static void main(String[] args) {
		String input = "";
		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println("Input is required..");
		}
		System.out.println("input is : "+input);
		getStringOccurances(input);
	}

	private static void getStringOccurances(String input) {
		Map<String, Integer> map = new HashMap<>();
		String[] split = input.split(" ");
		System.out.println("array size: "+split.length);
		for (int i = 0; i < split.length; i++) {
			if(map.containsKey(split[i])) {
				map.put(split[i], map.get(split[i])+1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println("sub string occurances:");
		System.out.println(map);
	}
}
