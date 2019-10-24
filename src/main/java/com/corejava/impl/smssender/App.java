/**
 * 
 */
package com.corejava.impl.smssender;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 1176119
 *
 */
public class App {

	/*
	 * First, we saw the “traditional” solution of a consumer-producer problem. We
	 * try to not reinvent the wheel when is not necessary, but instead, we want to
	 * reuse already tested solutions. So, instead of writing down a wait/notify
	 * system, why not use the Java blocking queue that already offers that? And
	 * also, we can get rid of manually creating threads when Java provides us with
	 * a thread pool that manages thread lifecycle very efficiently already. With
	 * these improvements, the solutions of the consumer-producer problem look more
	 * reliable and understandable.
	 */
	
	
	ThreadPoolExecutor threadPool = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new App().start();
	}

	//Classical way of executing threads
	/*private void start() {
		//Creating shared object
		final BlockingQueue<String> sharedQueue = new ArrayBlockingQueue<String>(3);
		//create producer with a fixed queue
		Producer producer = new Producer(sharedQueue);
		//start the producer
		new Thread(producer).start();
		
		Consumer c1 = new Consumer(sharedQueue);
		Consumer c2 = new Consumer(sharedQueue);
		Consumer c3 = new Consumer(sharedQueue);
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(c3).start();
	}*/
	
	//Using executors thread pool
	private void start() {
		final BlockingQueue<String> sharedQueue = new LinkedBlockingQueue<String>(5);
		//ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		//setting the rejectionhandler to the executor
		executorService.setRejectedExecutionHandler(new RejectedTaskHandler());
		
		Producer producer = new Producer(sharedQueue);
		executorService.execute(producer);
		
		Consumer consumer = new Consumer(sharedQueue);
		executorService.execute(consumer);
	}

}
