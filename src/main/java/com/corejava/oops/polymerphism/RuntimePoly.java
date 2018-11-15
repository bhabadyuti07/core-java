/**
 * 
 */
package com.corejava.oops.polymerphism;

/**
 * @author Bhabadyuti Bal
 *
 */
class Parent {
	
	public Parent(int i) {
		System.out.println("parent constructor");
	}
	
	public void display() {
		System.out.println("parent display");
	}
}

public class RuntimePoly extends Parent {
	
	

	public RuntimePoly(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("child display");
	}
	
	public static void main(String[] args) {
		RuntimePoly p = new  RuntimePoly(5);
		p.display();
	}
}
