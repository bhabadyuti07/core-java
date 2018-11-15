package com.corejava.oops;

interface A {
	void display();
}

interface B  {
	void display();
}

public class MultiInherit implements A, B {
	
	public static void main(String[] args) {
		MultiInherit inherit = new MultiInherit();
		inherit.display();
		
		//A a = new MultiInherit();
	}

	@Override
	public void display() {
		System.out.println("Inside MultiInherit display...");
		
	}

}
