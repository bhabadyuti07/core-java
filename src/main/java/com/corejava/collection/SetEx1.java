package com.corejava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.corejava.vo.Employee;

public class SetEx1 {

	public static void main(String[] args) {
		
		List<Employee> listFromArray = Arrays.asList(
				new Employee("John", 23),
				new Employee("Peter", 24),
				new Employee("John", 25),
				new Employee("Beni", 28)
				);
		
		
				
		 
		List<Employee> listOfPersons = new ArrayList<>();  
		listOfPersons.add(new Employee("John", 23));  
		listOfPersons.add(new Employee("Peter", 24));  
		listOfPersons.add(new Employee("John", 25));  
		listOfPersons.add(new Employee("Beni", 28));  
		for(Employee persson : listOfPersons) {
			if(persson.getAge() > 25){
				listOfPersons.remove(persson);
			}
		}
		
		
		/*ListIterator<Employee> iter = listOfPersons.listIterator();
		while(iter.hasNext()){
		    if(iter.next().getAge() > 25){
		        iter.remove();
		    }
		}*/
		
		System.out.println(listOfPersons);
	}
}
