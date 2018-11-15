package com.corejava.others;

import java.util.Arrays;

public class JavaObjectSorting {
	
	public static void main(String[] args) {
		Person[] empArr = new Person[4];
		empArr[0] = new Person("Mikey", 25);
		empArr[1] = new Person("Arun", 29);
		empArr[2] = new Person("Lisa", 35);
		empArr[3] = new Person("Pankaj", 32);
		Arrays.sort(empArr);
		for (Person person : empArr) {
			System.out.println(person.getName()+",");
		}
	}

}
