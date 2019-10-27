/**
 * 
 */
package com.corejava.java8features.nestedclass;

import com.corejava.java8features.nestedclass.Outer.StaticNestedClass;

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
