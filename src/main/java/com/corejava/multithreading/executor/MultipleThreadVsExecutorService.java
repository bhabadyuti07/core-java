/**
 * 
 */
package com.corejava.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SII068
 *
 */
public class MultipleThreadVsExecutorService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//createMultipleThreadNormally();
		createMultipleThreadsUsingExecutorService();
	}
	
	private static void createMultipleThreadsUsingExecutorService() {
		/**
		 * In the below code 100 tasks will be created but will be managed 
		 * by only 10 threads. While 10 threads are processing 10 tasks 
		 * other tasks will be in a BlockingQueue(Thread safe) and once a thread 
		 * completes a task it picks another task from the pool.
		 * 
		 * WHAT IS THE IDEAL POOL SIZE ?
		 * It depends on the type of task you execute. 
		 * Complex case[CPU intensive Task]: if the task is CPU intensive task like doing some hashing, then each task will
		 * take lot of CPU.
		 * And as each java thread equals to an OS thread. So if the OS has 4 cores then at a time we can have 4 threads 
		 * running parallelly irrespective of how many threads we create. And if we do create many threads then OS does 
		 * a time split scheduling. So in such case the ideal pool size is the number of cores the OS has. If OS has 4 
		 * cores then the ideal pool size should be 4. 
		 * 
		 * int coreCount = Runtime.getRuntime().availableProcessors();
		 * ExecutorService executor = Executors.newFixedThreadPool(coreCount);
		 * 
		 * 
		 * CASE 2 [I/O intensive task]: For tasks like doing some DB transactions or some HTTP operations once the request 
		 * has been made it waits for the OS to get a response. And if more threads are created all the threads will go to
		 * the waiting states being in 1 core.  So here we can have the pool size more.
		 * 
		 * ExecutorService executor = Executors.newFixedThreadPool(100);
		 * 
		 */
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			executor.execute(new MyTask());
		}
	}

	private static void createMultipleThreadNormally() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			new Thread(new MyTask()).start();
		}
	}

	static class MyTask implements Runnable {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}

}
