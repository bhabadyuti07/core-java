/**
 * 
 */
package com.corejava.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Bhabadyuti Bal
 * 
 * Given a LIst<Map<String, String>> which will have duplicate element entry in each map.
 * Create a List<Map<>>
 *
 */
public class Problem1 {
	
	List<Map<String, String>> list = new ArrayList<>();
	
	
	public boolean checkIfABPresent(String aVal, String bVal) {
		
		return false;
	}
	
	
	public static Set<Map<String, String>> getRawData(){
		Set<Map<String, String>> list = new HashSet<>();
		//IntStream.range(1, 5).forEach(i -> {
			Map<String, String> map1 = new HashMap<>();
			map1.put("A", "aaa");
			map1.put("B", "bbb");
			map1.put("C", "abn");
			map1.put("D", "ada");
			list.add(map1);
			
			Map<String, String> map2 = new HashMap<>();
			map2.put("A", "aaa");
			map2.put("B", "baa");
			map2.put("C", "ssn");
			map2.put("D", "mda");
			list.add(map2);
			
			Map<String, String> map3 = new HashMap<>();
			map3.put("A", "aaa");
			map3.put("B", "bbb");
			map3.put("C", "ssn");
			map3.put("D", "mda");
			list.add(map3);
		//});
		return list;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getRawData());
	}

}
