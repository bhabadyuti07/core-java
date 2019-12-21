/**
 * 
 */
package com.corejava.java8.nestedclass;

/**
 * @author Bhabadyuti Bal
 *
 */
public class Outer {
	
	/**
	 * scope of nested class is bounded by the scope of its enclosing class. 
	 * RULES:
	 * 1. The scope of a nested class is bounded by the scope of its enclosing
	 * class. Thus in above example, class NestedClass does not exist independently
	 * of class OuterClass.
	 * 
	 * 2. A nested class has access to the members, including private members, of
	 * the class in which it is nested. However, reverse is not true i.e. the
	 * enclosing class does not have access to the members of the nested class.
	 * 
	 * 3. A nested class is also a member of its enclosing class.
	 * 
	 * 4. As a member of its enclosing class, a nested class can be declared
	 * private, public, protected, or package private(default).
	 * 
	 * 5. Nested classes are divided into two categories: 
	 * 5.1. static nested class : Nested classes that are declared static.
	 * 5.2. inner class : An inner class is a non-static nested class.
	 */
	
	//static member
	static int outer_x = 10;
	//instance or non-static member
	int outer_y = 20;
	//private member
	private static int outer_private = 30;
	
	public class Inner {
		
	}
	
	
	public static class StaticNestedClass {
		
		void doSomething() {
			System.out.println("static outer variable - "+outer_x);
			
			System.out.println("private static member - "+outer_private);
			Outer outer = new Outer();
			Inner inner = outer.new Inner();
		}
	}
	
	

}
