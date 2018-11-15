package com.corejava.java8features.unit2;

import java.util.Arrays;
import java.util.List;

import com.corejava.vo.Person;

public class MapperExample {
	
	public static void main(String[] args) {
		
		
		List<Person> persons = Arrays.asList(
				new Person("Bhaba", "Bal", 28), 
				new Person("Deba", "Bal", 30), 
				new Person("Bulu", "Bal", 24),
				new Person("Laxman", "Bal", 25)
		);
		
		
//		persons.stream()
//				.filter(MapperExample::isStartsWithB)
//				.map()
	}

	public static boolean isStartsWithB(Person p) {
		return true;
	}
}
