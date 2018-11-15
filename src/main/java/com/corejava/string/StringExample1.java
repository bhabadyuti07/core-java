package com.corejava.string;

public class StringExample1 {

	public static void main(String[] args) {
		String ex = "sipu";
		String ob = "sipu";
		//System.out.println(ex == ob);
		//System.out.println(ex.equals(ob));
		String ex1 = new String("sipu");
		String ex2 = new String("sipu");
		ex1.concat("dipu");
		//System.out.println(ex1);
		
		System.out.println(ex1 == ex2);
		System.out.println(ex1.hashCode() == ex1.hashCode());
	}
}
