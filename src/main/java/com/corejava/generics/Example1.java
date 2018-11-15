/**
 * 
 */
package com.corejava.generics;

/**
 * @author Bhabadyuti Bal
 *
 */
class Test<T> {
	
	T object;
	public Test(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return this.object;
	}
	
}


public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test<String> test1 = new Test<String>("abc");
		Test<Integer> test2 = new Test<Integer>(123);
		System.out.println(test1.getObject());
		System.out.println(test2.getObject());
	}

}
