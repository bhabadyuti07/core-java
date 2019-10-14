/**
 * 
 */
package com.corejava.multithreading.example.weekend;

/**
 * @author Bhabadyuti Bal
 *
 */
public class WeekendWorker {
	
	/*
	 * Here the main thread meaning 1 person trying to do all tasks
	 * one after the other.
	 * 
	 * As a result total time taken to complete all tasks is 15 secs.
	 */
	
	//org.slf4j.Logger logger = LoggerFactory.getLogger(WeekendWorker.class);
	
	public void doShopping() throws InterruptedException {
		System.out.println("Shopping...");
		Thread.sleep(5000);
	}
	
	public void doCleaning() throws InterruptedException {
		System.out.println("Cleaning...");
		Thread.sleep(5000);
	}
	
	public void doCooking() throws InterruptedException {
		System.out.println("Cooking...");
		Thread.sleep(5000);
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WeekendWorker worker = new WeekendWorker();
		System.out.println("Day started!");
		long startTime = System.currentTimeMillis();
		worker.doShopping();
		worker.doCooking();
		worker.doCleaning();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+((endTime - startTime)/1000)+" secs");
	}

}