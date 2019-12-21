/**
 * 
 */
package com.corejava.java8.nestedclass;

import com.corejava.java8.nestedclass.Outer.StaticNestedClass;

/**
 * @author Bhabadyuti Bal
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		StaticNestedClass nestedClass = new StaticNestedClass();
		nestedClass.doSomething();
	}

}
