package com.corejava.java8features.unit2;

import java.util.Arrays;
import java.util.List;

import com.corejava.vo.Person;

public class CollectionIterationExample {
	
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Bhaba", "Bal", 28), 
				new Person("Deba", "Bal", 30), 
				new Person("Bulu", "Bal", 24),
				new Person("Laxman", "Bal", 25)
		);
		
		System.out.println("using for loop");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
		System.out.println("Using foreach loop");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		//Internal iterator
		System.out.println("java 8 foreach way");
		persons.forEach(System.out::println);
		
		persons.forEach((p) -> {
			
		});
	}

}
