package com.corejava.java8features.lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.corejava.vo.Person;

public class Exercise1Java7 {

	public static void printAll(List<Person> persons) {
		// Java 7 way
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Bhaba", "Bal", 28), 
				new Person("Deba", "Bal", 30), 
				new Person("Bulu", "Bal", 24),
				new Person("Laxman", "Bal", 25)
		);

		// 1. Sort persons by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});

		// 2. Print all persons
		printAll(persons);

		// 3. create a method that prints all persons firstName stating with b
		printPersonsStartingWithB(persons, new Condition() {
			@Override
			public boolean check(Person p) {
				return p.getFirstName().startsWith("B");
			}
		});
	}

	private static void printPersonsStartingWithB(List<Person> persons, Condition condition) {
		for (Person person : persons) {
			if (condition.check(person)) {
				System.out.println(person);
			}
		}
	}

	interface Condition {
		boolean check(Person p);
	}
}
