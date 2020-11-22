/**
 * 
 */
package com.corejava.multithreading.executor;

/**
 * @author SII068
 *
 */
public class SimpleNewThreadRun {
	
	public static void main(String[] args) {
		new Thread(new NewTask()).start();
		System.out.println(Thread.currentThread().getName());
	}
	
	static class NewTask implements Runnable {
		// In java one thread corresponds one OS thread
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			
		}
	}

}
