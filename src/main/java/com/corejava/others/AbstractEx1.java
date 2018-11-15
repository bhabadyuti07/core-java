package com.corejava.others;

public abstract class AbstractEx1 {
	
	private static boolean isUpdate = false;
	
	public static void demo(){
		System.out.println("Hello");
	}

	private static boolean display(){
		return isUpdate = true;
	}
	public static void main(String[] args) {
		System.out.println(display());
	}

}
