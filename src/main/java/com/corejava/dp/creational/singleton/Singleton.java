/**
 * 
 */
package com.corejava.dp.singleton;

/**
 * @author Bhabadyuti Bal
 *
 */
public class Singleton {
	
	private static final Singleton instance = new Singleton();
	
	//private constructor to avoid outer initialization
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	

}
