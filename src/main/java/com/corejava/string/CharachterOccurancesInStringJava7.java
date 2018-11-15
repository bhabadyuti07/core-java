/**
 * 
 */
package com.corejava.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhabadyuti Bal
 * 
 */
public class CharachterOccurancesInStringJava7 {
	
	public static void main(String[] args) {
		String name = "bhabadyuti";
		System.out.println("Input string: "+name);
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			if(map.containsKey(charAt)) {
				map.put(charAt, map.get(charAt) + 1);
			} else {
				map.put(charAt, 1);
			}
		}
		System.out.println("map: "+map);
	}

}
