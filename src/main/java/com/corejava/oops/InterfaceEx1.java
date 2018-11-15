package com.corejava.oops;

public interface InterfaceEx1 {
	
	public void display();
	
	default void pinchMe(String toWhom) {
		System.out.println("Okey! pinched");
	}
	
	static void oneMorePinch() {
		System.out.println("Okey! But harder this time");
	}

}
