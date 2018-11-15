package com.corejava.multithreading.syncronizan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Bhabadyuti Bal
 * 
 * Improved version of Worker
 * 
 * Advanced Java: Multi-threading Part 4 -- Multiple Locks; Using
 *         Synchronized Code Blocks
 *
 */

public class Worker {

	private Random random = new Random();
	String threadName = "";

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public synchronized void stageOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		list1.add(random.nextInt(100));
	}

	public synchronized void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		list2.add(random.nextInt(100));

	}

	public void process() {
		threadName = Thread.currentThread().getName();
		System.out.println("Thread in process: "+threadName);
		for (int i = 0; i < 1000; i++) {
			stageOne();//As it is a synchronized method, so this method gets intrinsic lock for thread 
			stageTwo();//So, after execution of this method, control moves to stageTwo() & follows same
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
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		
		
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
		
		/*O/P: The time taken is more bcoz stageOne & stageTwo are synchronized, so each thread has to wait for completion.
		Starting....
		Thread Name: main
		Time taken: 4966
		List1 size: 2000
		List1 size: 2000*/
	}

}
