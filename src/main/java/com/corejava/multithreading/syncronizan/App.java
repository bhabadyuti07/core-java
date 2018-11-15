package com.corejava.multithreading.syncronizan;

/**
 * 
 * @author Bhabadyuti Bal
 * 
 * Advanced Java: Multi-threading Part 3 -- The Synchronized Keyword
 *
 */

public class App {
	
	private int count = 0;
	String threadName = "";
	
	//To test dont call this method, instead just do count++ and check. It'll give unexpected result.
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		app.doWork();
	}

	public void doWork() {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				threadName = Thread.currentThread().getName();
				System.out.println("Count by: "+ threadName+" "+count);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				threadName = Thread.currentThread().getName();
				System.out.println("Count by: "+ threadName+" "+count);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threadName = Thread.currentThread().getName();
		System.out.println("Count by: "+ threadName+" "+count);
		System.out.println("Count is: "+count);
		
	}

}
