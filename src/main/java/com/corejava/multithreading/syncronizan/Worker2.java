package com.corejava.multithreading.syncronizan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Bhabadyuti Bal
 * 
 * Advanced Java: Multi-threading Part 4 -- Multiple Locks; Using
 *         Synchronized Code Blocks
 *
 */

public class Worker2 {

	private Random random = new Random();
	String threadName = "";
	
	//Best practice to declare separate object for acquiring locks
	Object lock1 = new Object();
	Object lock2 = new Object();
	

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public void stageOne() {
	//Synchronized block can be used to perform synchronization on any specific resource of the method.
	//Here, it acquires intrinsic lock on lock1 object, not on worker object
		//changing from 'lock1'/'list1' to 'this' will acquire lock on Worker object.Its better not to 
		//acquire lock on the same object on which we are doing the operations.
		synchronized (lock1) {  
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			list1.add(random.nextInt(100));
		}
	}

	public void stageTwo() {
		//Synchronized block can be used to perform synchronization on any specific resource of the method.
		//Here, it acquires intrinsic lock on lock2 object, not on worker object
		synchronized (lock2) {//changing from 'lock2'/'list2' to 'this' will acquire lock on Worker object
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() {
		System.out.println("Starting....");

		long startTime = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();

		threadName = Thread.currentThread().getName();
		System.out.println("Thread Name: " + threadName);
		System.out.println("Time taken: " + (endTime - startTime));
		System.out.println("List1 size: " + list1.size());
		System.out.println("List1 size: " + list2.size());
		
		/*O/P: The time taken is less bcoz stageOne & stageTwo has synchronized blocks, so each thread works on same time for completion.So CPU utilization is more here.
		Starting....
		Thread Name: main
		Time taken: 2614
		List1 size: 2000
		List1 size: 2000*/
	}

}
