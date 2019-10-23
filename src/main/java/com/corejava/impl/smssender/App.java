/**
 * 
 */
package com.corejava.impl.smssender;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 1176119
 *
 */
public class App {

	
	ThreadPoolExecutor threadPool = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
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
	}
	
	

	
	

}
