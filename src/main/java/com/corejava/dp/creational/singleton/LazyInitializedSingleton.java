/**
 * 
 */
package com.corejava.dp.singleton;

/**
 * @author Bhabadyuti Bal
 * 
 * 
 * The above implementation works fine incase of single threaded environment 
 * but when it comes to multithreaded systems, it can cause issues if multiple 
 * threads are inside the if loop at the same time. It will destroy the singleton 
 * pattern and both threads will get the different instances of singleton class.
 *
 */


public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {}
	
	public LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
