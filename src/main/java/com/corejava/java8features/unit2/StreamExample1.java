package com.corejava.java8features.unit2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.vo.Person;

public class StreamExample1 {
	
	public static void main(String[] args) {
		
		
		List<Person> persons = Arrays.asList(
				new Person("Bhaba", "Bal", 28), 
				new Person("Deba", "Bal", 30), 
				new Person("Bulu", "Bal", 24),
				new Person("Laxman", "Bal", 25)
		);
		/*
		 * stream - kind of conveyor belt which carries the items/source
		 */
		//first part
		persons.stream()
			//second part
			.filter(p -> p.getFirstName().startsWith("B"))
			//end part
			.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = persons.stream()
			.filter(p -> p.getFirstName().startsWith("B"))
			.count();
		System.out.println(count);
		
		System.out.println("Age more than 28");
		List<Person> people = persons.stream()
			.filter(StreamExample1::isAgeGreaterThan28)
			//.forEach(System.out::println);
			.collect(Collectors.toList());
		
		System.out.println(people);
		
		System.out.println("-------Using filter & map-------------");
		List<String> names = persons.stream().filter(p -> p.getAge() > 25).map(Person::getFirstName).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
	
	public static boolean isAgeGreaterThan28(Person person) {
		return person.getAge() > 28;
	}

}
