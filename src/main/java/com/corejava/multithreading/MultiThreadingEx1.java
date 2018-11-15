/**
 * 
 */
package com.corejava.multithreading;

/**
 * @author Bhabadyuti Bal
 *
 */
public class MultiThreadingEx1 {
	
	
	public static void sendMail() {
		System.out.println("Sending Mail....");
		Thread th = new Thread(new MyThread());
		th.start();
		th.interrupt();
		System.out.println("Mail sent !!!");
	}
	
	public static void main(String[] args) {
		Thread.currentThread().setName("MyThread");
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		myThread.interrupt();
		System.out.println("Interrupt called...");
	}

}
