/**
 * 
 */
package com.corejava.multithreading;

/**
 * @author Bhabadyuti Bal
 *
 */
public class GenericThread implements Runnable {
		

	public void run() {
		System.out.println("Inside: "+Thread.currentThread().getName());
	}

}
