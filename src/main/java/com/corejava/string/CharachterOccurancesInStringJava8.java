/**
 * 
 */
package com.corejava.string;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Bhabadyuti Bal
 * 
 */
public class CharachterOccurancesInStringJava8 {
	
	
	public static void findCharachterOccurancesInString(final String name){

		System.out.println("Input string: "+name);
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			if (!map.containsKey(charAt)) {	
				map.put(charAt, 1);
			} else {
				map.put(charAt, map.get(charAt) + 1);
			}
		}
		System.out.println("map: "+map);
	}
	
	
	public static void main(String[] args) throws IOException {
		int res = findFrequency();

	}


	private static int findFrequency() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			if (map.get(charAt) == null) {
				map.put(charAt, 1);
			} else {
				map.put(charAt, map.get(charAt) + 1);
			}
		}
		System.out.println(map);
		return 0;
	}
	
}
