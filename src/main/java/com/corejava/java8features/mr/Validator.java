/**
 * 
 */
package com.corejava.java8features.mr;

/**
 * @author Bhabadyuti Bal
 *
 */
@FunctionalInterface
public interface Validator<T> {
	
	public abstract boolean isValid(T t);
	
	default void hoot() {
		System.out.println("hooted...");
	}
	
	default void soot() {
		System.out.println("hooted...");
	}

}
