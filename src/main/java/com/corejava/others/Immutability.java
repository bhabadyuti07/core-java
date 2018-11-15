/**
 * 
 */
package com.corejava.others;

/**
 * @author Bhabadyuti Bal
 *
 */
public final class Immutability {

	private final int id;
	private final String name;
	private final Age age; //mutable object
	

	public Immutability(int id, String name, Age age) {
	    this.name = name;
	    this.id = id;
	    this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}
	
}
