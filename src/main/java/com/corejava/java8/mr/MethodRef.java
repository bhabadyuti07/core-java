/**
 * 
 */
package com.corejava.java8.mr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import com.corejava.vo.Employee;

/**
 * @author Bhabadyuti Bal
 *
 */
public class MethodRef {
	
	//https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx
	
	public MethodRef() {
		System.out.println("Methodref constructor called...");
	}
	
	public static void useObject(Object ob){
		//...
	}
	
	public static boolean employeeVerification(Employee e, Validator<Employee> v ) {
		if(v.isValid(e)) {
			return true;
		}
		return false;
	}
	
	public static boolean isMoreThanFiftyAge(Employee e) {
		if(e.getAge() < 50) 
			return true;
		return false;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//MethodRef ref = MethodRef::new;
		
		//Using references to objects - 1. By creating new objects
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Athl Dev", 25));
		list.add(new Employee("Sharan H", 29));
		list.add(new Employee("Jaykumar P", 29));
		//2. By using the existing method
		useObject(list);
		
		
		
		// But what about a reference to a method ? If we only use a method of an object
		// in another method, we still have to pass the full object as an argument.
		// Wouldn't it be more practical to just pass the method as an argument? For
		// example: isFull(list.size);
		
		//A method reference is the shorthand syntax for a lambda expression that executes just ONE method. 
		//example- Object :: methodName
		
		
		/**
		 * In a method reference, you place the object (or class) that contains the
		 * method before the :: operator and the name of the method after it without
		 * arguments.
		 * 
		 * Instead of using 
		 * AN ANONYMOUS CLASS => use A LAMBDA EXPRESSION 
		 * And if this just calls one method, 
		 * you can use A METHOD REFERENCE
		 * 
		 */
		//Consumer<String> c = (s) -> System.out.println(s);
		Consumer<String> c = System.out::println;
		Stream.of("xyz", "abc").forEach(c);
		
		
		/**
		 * There are four types of method references:
		 * 
		 * A method reference to a static method. 
		 * A method reference to an instance method of an object of a particular type. 
		 * A method reference to an instance method of an existing object. 
		 * A method reference to a constructor.
		 */
		//1. Static method reference
		
		Employee e = new Employee("Dubby", 30);
		employeeVerification(e, new Validator<Employee>() {
			@Override
			public boolean isValid(Employee e) {
				return isMoreThanFiftyAge(e);
			}
		});
		
		employeeVerification(e, (r) -> MethodRef.isMoreThanFiftyAge(r));
		employeeVerification(e, MethodRef::isMoreThanFiftyAge);
		
		
		Collections.sort(list, new SortByName());
		//OR
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		Function<String, Integer> f = new Function<String, Integer>() {
			public Integer apply(String s) {
				return new Integer(s);
			}
		};
		
		f.apply("100");
		
		
		//using Lambda
		Function<String, Integer> f1 = (s) -> new Integer(s);
		f1.apply("200");
		
		//using method ref
		//This means its returning the return vlue from the abstract metod declared in FI Function<>
		Function<String, Integer> f2 = Integer::new;

	}

}
