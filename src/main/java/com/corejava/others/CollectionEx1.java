package com.corejava.others;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionEx1 {

	private static void sortListInReverseOrder(List<Person> list) {
		Comparator<Object> comparator = Collections.reverseOrder();
		Collections.sort(list, comparator);
		System.out.println(list.stream().map(Person::getName).collect(Collectors.toList()));
	}
	
	
	public static void main(String[] args) {
	/*	List<Person> list = new ArrayList<>();
		list.add(new Person("Jhon1",18));
		list.add(new Person("Jhon2",24));
		list.add(new Person("Jhon3",29));
		list.add(new Person("Jhon4",24));*/
		
		List<Person> list = Arrays.asList(
				new Person("Jhon1",18),
				new Person("Jhon2",24),
				new Person("Jhon3",29),
				new Person("Jhon4",24));
		/*
		Iterator<Person> itr = list.iterator();
		while(itr.hasNext()) {
			Person person = itr.next();
			if(person.getAge() > 25) {
				itr.remove();
			}
		}
		
		System.out.println(list);*/
		sortListInReverseOrder(list);
	}
}
