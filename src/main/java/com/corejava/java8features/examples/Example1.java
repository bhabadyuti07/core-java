package com.corejava.java8features.examples;

import java.util.Arrays;
import java.util.List;

import com.corejava.vo.Person;

public class Example1 {
	
	/*
	 * given a list of elements, filter the values 
	 */
	public static void filterValuesFromCollection() {
		List<Person> listOfPersons = Arrays.asList(  
				new Person("John", 23),  
				new Person("Peter", 20),  
				new Person("Jenny", 25),  
				new Person("Beni", 30));
		
		listOfPersons.stream()
				.filter(pp -> pp.getAge() > 25)
				.forEachOrdered(System.out::println);
	}
	
	
	public static void main(String[] args) {
		filterValuesFromCollection();
	}

}
