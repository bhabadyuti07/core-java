package com.corejava.java8features.lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.corejava.vo.Person;

public class Exercise1Java8Way {


	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Bhaba", "Bal", 28), 
				new Person("Deba", "Bal", 30), 
				new Person("Bulu", "Bal", 24),
				new Person("Laxman", "Bal", 25)
		);

		// 1. Sort persons by last name
		//p1, p2 considered to be of Person type because of Type Inference
		Collections.sort(persons, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		// 2. Print all persons
		printConditionally(persons, p -> true);

		// 3. create a method that prints all persons firstName stating with b
		printConditionally(persons, p -> p.getFirstName().startsWith("B"));
	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate) {
		System.out.println("Printing persons first name starting with B");
		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}
	}
}
