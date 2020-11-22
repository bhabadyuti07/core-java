/**
 * 
 */
package com.corejava.problemsolving;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author SII068
 *
 */
public class ReadJson {
	
	public static Map getMapFromJson() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("C:\\Users\\SII068\\Desktop\\context.json");
		return mapper.readValue(file, Map.class);
	}
	
	static Map<String, String> newMap = new LinkedHashMap<>();
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Map<Object, Object> map = getMapFromJson();
		String[] array = new String[] {"anmit", "pooja"};
		
		createMap(map);
		//TODO: Parse the above map and create a new map which will contain string as value
		System.out.println(newMap);
	}

	public static void createMap(Map<Object, Object> map) {
		map.entrySet().stream().forEach(m -> {
			Object value = m.getValue();
			if(isString(value)) {
				if(checkIfRequiredParamsPresent(m)) {
					newMap.put(m.getKey().toString(), value.toString());
				} 
			} else if(isMap(value)) {
				createMap((Map)value);
			} else if(isArrayOfMap(value)) {
				try {
					ArrayList<Map> ar = (ArrayList)value;
					ar.stream().forEach(im -> {
						if(isString(im)) {
							if(checkIfRequiredParamsPresent(m)) {
								newMap.put(m.getKey().toString(), value.toString());
							} 
						}else if(isMap(im)) {
							createMap(im);
						}
					});
				} catch (ClassCastException cce) {
					if(checkIfRequiredParamsPresent(m)) {
						newMap.put(m.getKey().toString(), value.toString());
					} 
				}
				
			} else if(isInteger(value)) {
				if(checkIfRequiredParamsPresent(m)) {
					newMap.put(m.getKey().toString(), value.toString());
				} 
			}
		});
	}
	private static boolean checkIfRequiredParamsPresent(Entry<Object, Object> m) {
		if(m != null) {
			String key = m.getKey().toString();
			String value = m.getValue().toString();
			if((key.equals("from-currency-name") || key.equals("to-currency-name") || key.equals("date") || key.equals("amount")) && value != "")
				return true;
		}
		return false;
	}

	//m.getKey().toString().equals("from-currency-name") && value.toString() != ""
	
	private static boolean isInteger(Object value) {
		if(value instanceof Integer)
			return true;
		return false;
	}

	private static boolean isArrayOfMap(Object value) {
		if(value instanceof ArrayList) {
			return true;
		}
		return false;
	}

	private static boolean isMap(Object value) {
		if(value instanceof Map)
			return true;
		return false;
	}

	public static boolean isString(Object value) {
		if(value instanceof String)
			return true;
		return false;
	}
}
