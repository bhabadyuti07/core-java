package com.corejava.others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
	
	
	static void findArrayElementsDupsChars() {
		String[] str = {"Hello", "World"};
		for (String string : str) {
			Map<String, Integer> map = new LinkedHashMap<>();
			int length = string.length();
			for (int i = 0; i < length; i++) {
				String valueOf = String.valueOf(string.charAt(i));
				if(map.containsKey(valueOf)) {
					map.put(valueOf, map.get(valueOf) + 1);
				} else {
					map.put(valueOf, 1);
				}
			}
			System.out.println(map);
		}
		
	}
	
	
	static void lengthOfNonRepeatedNumbers(Integer[] array) {
		
		Set<Integer> set = new HashSet<>(Arrays.asList(array));
		System.out.println("Size of array: "+set.size());
	}
	
	
	static void getDupsCountNormalWay(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				} 
			}
			if(count > 1) {
				System.out.println(array[i]+" - "+count);
			}
		}
	} 
	
	
	static void getDupsCount(int[] array) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		Integer[] array = {2, 2, 3, 4, 5, 6, 7, 6};
		//getDupsCount(array);
		//getDupsCountNormalWay(array);
		//lengthOfNonRepeatedNumbers(array);
		findArrayElementsDupsChars();
	}

}
