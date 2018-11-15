/**
 * 
 */
package com.corejava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import com.corejava.vo.Employee;

/**
 * @author Bhabadyuti Bal
 *
 */
public class ListIteration {
	/*
	 * this way of filter will work
	 */
	static void filterValues(List<Employee> list) {
		List<Employee> newList = new ArrayList<Employee>();
		for (Employee employee : list) {
			if(employee.getAge() < 25) {
				newList.add(employee);
			}
		}
		System.out.println(newList);
	}
	
	/*
	 * this throws java.lang.UnsupportedOperationException, because the
	 * list is a fixed 	 * size list backed by an array. So we cannot do
	 * add or remove operation 
	 */
	static void filterValuesByRemovingUnwanted(List<Employee> list) {
		for (Employee employee : list) {
			if(employee.getAge() > 25) {
				list.remove(employee);
			}
		}
		System.out.println(list);
	}
	
	/*
	 * iterator.hasNext() checks the next element to traverse is exist or not. 
	 * iterator.next() gets the next element and moves the pointer to the next address,
	 * so now you can remove the element in the current address.
	 * A try to remove the current element without forwarding the pointer will cause
	 * java.lang.IllegalStateException 
	 * 
	 */
	static void filterValuesByRemovingUnwantedUsingIterator(List<Employee> list) throws IllegalStateException {
		ListIterator<Employee> iterator = list.listIterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			if(emp.getAge() > 25) {
				iterator.remove();
				iterator.add(new Employee("Sipu", 28));
			}
		}
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		List<Employee> listFromArray = Arrays.asList(
				new Employee("John", 23),
				new Employee("Peter", 24),
				new Employee("John", 25),
				new Employee("Beni", 28)
				);
		
		List<Employee> fixedSizeList = new ArrayList<>(4);
		fixedSizeList.add(new Employee("John", 23));
		fixedSizeList.add(new Employee("Peter", 24));
		fixedSizeList.add(new Employee("John", 25));
		fixedSizeList.add(new Employee("Beni", 28));
		
		//filterValuesWay1(new ArrayList<>(listFromArray)	);
		
		//filterValues(listFromArray);
		
		filterValuesByRemovingUnwantedUsingIterator(fixedSizeList);
	}

}
