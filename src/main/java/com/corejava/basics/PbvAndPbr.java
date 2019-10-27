/**
 * 
 */
package com.corejava.basics;

/**
 * @author Bhabadyuti Bal
 *
 */
public class PbvAndPbr {
	
	public static void prettyPrint(final String text){
		System.out.println(text);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Java does manipulate objects by reference, and all object variables are references.
		String str = new String("Hello");
		
		//However, Java doesn't pass method arguments by reference; it passes them by value.
		//here the value of str gets passed to the definition
		prettyPrint(str);
	}

}
