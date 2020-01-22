package com.corejava.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.corejava.vo.Employee;

public class Examples {
	
	public static List<Employee> getAllEmployees() {
		return Arrays.asList(new Employee("Bhabadyuti Bal", 28),
				new Employee("Athui Dev", 25),
				new Employee("Sharan H", 28),
				new Employee("Jay Kumar", 30),
				null);
	}
	
	static Comparator<Employee> empComparator = (e1, e2) -> {
		return e1.getName().compareTo(e2.getName());
	} ;
	
	
	
	public static void checkStreamOnListFeature() {
		List<String> collect = getAllEmployees().stream()
				.filter(e->Objects.nonNull(e))
				//.sorted(empComparator)
				//.filter(e -> e.getAge() > 25)
				.map(Employee::getName)
				.collect(Collectors.toList());
		Collections.sort(collect);
		System.out.println(collect);
	}
	
	public static void checkStreamOnMapFeature() {
		Map<Integer, String> finalMap = new HashMap<>();
		Map<Integer, Employee> allEmployeesMap = getAllEmployeesMap();
		//get all entries
		allEmployeesMap.entrySet().stream()
			.filter(e -> Objects.nonNull(e.getValue())).forEach(s -> {
				finalMap.put(s.getKey(), s.getValue().getName());
			});
			//.collect(Collectors.toMap(Employee::get, valueMapper))
		
		finalMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.forEach(System.out::println);
			
		
		//System.out.println(finalMap);
		/*Iterator<Entry<Integer, Employee>> iterator = allEmployeesMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Employee> e = iterator.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		allEmployeesMap.forEach((k, v) -> {
			if(Objects.nonNull(v)) {
				System.out.println(k+" : "+v.getName());
			}
		});*/
		
		
	}
	
	
	private static Map<Integer, Employee> getAllEmployeesMap() {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Employee("Bhabadyuti Bal", 28));
		map.put(2, new Employee("Sharan H", 28));
		map.put(3, new Employee("Jay Kumar", 30));
		map.put(4, null);
		
		return map;
	}

	private static void checkStreamWithoutTerminalFunction() {
		Stream<String> inVendors = Arrays.asList("Flipkart - IN", "Amazon - US",
				"Grooferes - IN", "Bigbasket - IN")
				.stream().filter(s -> s.contains("IN"));
		inVendors.forEach(System.out::print);
	}

	public static void main(String[] args) {
		//checkStreamOnListFeature();
		//checkStreamOnMapFeature();
		checkStreamWithoutTerminalFunction();
	}


}
