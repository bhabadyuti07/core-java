/**
 * 
 */
package com.corejava.multithreading;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author Bhabadyuti Bal
 * 
 * This class is thread class by extending Thread class
 *
 */
public class CustomThread extends Thread {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomThread.class);
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		System.out.println("Thread "+threadName+" running.");
		MultiThreadingEx1.sendMail();
		System.out.println("Thread "+threadName+" is alive: "+currentThread.isAlive());
		if(currentThread.isAlive()) {
			try {
				currentThread.join();
				System.out.println("join called...");
				System.out.println("Thread "+threadName+" is alive: "+currentThread.isAlive());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		CustomThread thread1 = new CustomThread();
		CustomThread thread2 = new CustomThread();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		thread1.start();
		thread2.start();
	}

	
}
