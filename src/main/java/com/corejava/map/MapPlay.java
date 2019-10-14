/**
 * 
 */
package com.corejava.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 1176119
 *
 */
public class MapPlay {
	
	
	public static Map<String, Integer> getEmployeesWithExp(Map<String, Map<String, Integer>> map) {
		
		Map<String, Integer> collect = map.entrySet()
				.stream().collect(Collectors.toMap(e->e.getKey(), 
											e->e.getValue()
											.values()
											.stream()
											.reduce(1, Integer::sum)));
		return collect;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Map<String, Integer>> map = new HashMap<>();
		Map<String, Integer> innerMap1 = new HashMap<>();
		innerMap1.put("INfosys", 2);
		innerMap1.put("Volvo", 2);
		innerMap1.put("MH", 3);
		innerMap1.put("Piterion", 1);
		
		Map<String, Integer> innerMap2 = new HashMap<>();
		innerMap2.put("Tata", 2);
		innerMap2.put("Bosch", 1);
		innerMap2.put("Amber", 1);
		innerMap2.put("E2", 1);
		
		map.put("Rahul", innerMap1);
		map.put("Amrita", innerMap2);
		
		System.out.println(getEmployeesWithExp(map));
		
	}

}
