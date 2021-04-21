package com.corejava.collection.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	@Test
	public void whenHashCodeIsCalledOnPut_thenCorrect() {
		MyKey key = new MyKey(1);
		Map<MyKey, String> map = new HashMap<>();
		map.put(key, "value");
	}

	@Test
	public void whenPuttingSameKey_returnsPrevVal_thenCorrect() {
		MyKey key = new MyKey(1);
		Map<MyKey, String> map = new HashMap<>();
		String put = map.put(key, "value1");
	}


	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String val1 = map.put("key1", "value1");
		String val2 = map.put("key1", "value2");
		System.out.println(val1+" , "+map.get("key1"));
		System.out.println(map);
	}

}
