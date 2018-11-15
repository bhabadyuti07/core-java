/**
 * 
 */
package com.corejava.multithreading;

/**
 * @author Bhabadyuti Bal
 *
 */
public class RunnableExampleAnonymousClass {
	
	public static void main(String[] args) {
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		System.out.println("Creating Runnable...");		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside: "+Thread.currentThread().getName());
				
			}
		};
		
		System.out.println("Creating the thread...");
		Thread thread = new Thread(runnable);
		
		thread.start();
	}

}
