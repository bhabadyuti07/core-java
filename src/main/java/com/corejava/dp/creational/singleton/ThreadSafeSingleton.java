/**
 * 
 */
package com.corejava.dp.creational.singleton;

/**
 * @author Bhabadyuti Bal
 *
 */
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
