/**
 * 
 */
package com.corejava.oops;

/**
 * @author Bhabadyuti Bal
 *
 */

class Laptop {
	
}

interface Formattable {
	
}

public class IsARelationship extends Laptop implements Formattable{
	
	public static void main(String[] args) {
		IsARelationship dell = new IsARelationship();
		//Here dell IS-A Laptop
		System.out.println(dell instanceof Laptop);
	}

}
