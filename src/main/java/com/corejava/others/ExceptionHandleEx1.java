package com.corejava.others;

import java.io.FileNotFoundException;

public class ExceptionHandleEx1 {

	public static void m1() {
		try {
			m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inside m1...");
	}

	public static void m2() {
		try {
			m3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inside m2...");
	}

	public static void m3() {
		try {
			m4();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inside m3...");
	}

	public static void m4() {
		try {
			throw new FileNotFoundException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("inside m4...");
	}
	
	public static void main(String[] args) {
		m1();
	}
}
