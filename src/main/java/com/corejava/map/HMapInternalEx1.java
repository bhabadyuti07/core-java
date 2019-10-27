package com.corejava.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HMapInternalEx1 {
	
	
	@Test
	public void whenHashCodeIsCalledOnGet_thenCorrect() {
	    MyKey key = new MyKey(1);
	    System.out.println("dfsdfas");
	    Map<String, String> map = new HashMap<>();
	    map.put("key", null);
	    boolean valPresent = map.containsKey("key");
	    System.out.println(valPresent);
	    map.get("key4");
	    boolean valPreset = map.containsKey("key4");
	    System.out.println(valPreset);
	}
	
	//@Test
	public void addingExistingKey() {
		HashMap<String, String> map = new HashMap<>();
		//map.put("k1", "v1");
		String val = map.put("k1", "v2");
		//assertNull(val);
		//assertEquals("v1", val);
	}

	//@Test
	public void hashCodeInvokedWhileAddingKey() {
		MyKey key = new MyKey(1);
		HashMap<MyKey, String> map = new HashMap<>();
		map.put(key, "bb");
	}
}
