package com.corejava.others;

public class NullTypeCheck {
	
	public static void show(Object object) {
		System.out.println("object");
	}
	
	
	public static void show(String object) {
		System.out.println("String");
	}
	
	
	/*public static void show(Integer object) {
		System.out.println("Integer");
	}*/
	
	public static void main(String[] args) {
		show(null);
	}

}
