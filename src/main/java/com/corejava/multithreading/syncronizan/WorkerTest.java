package com.corejava.multithreading.syncronizan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerTest {

	static List<Integer> list1 = new ArrayList<>();
	static List<Integer> list2 = new ArrayList<>();

	Random random = new Random();

	public static void process() {
		for (int i=0; i< 11;i++) {
			stageOne();
			stageTwo();
		}
	}

	public static void stageOne() {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (list1) {
				list1.add(new Random().nextInt(50));
			}
	}

	public static void stageTwo() {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (list2) {
				list2.add(new Random().nextInt(50));
			}
	}
	
	Thread thread1 = new Thread(new Runnable() {

		@Override
		public void run() {
			process();

		}
	});

	Thread thread2 = new Thread(new Runnable() {

		@Override
		public void run() {
			process();

		}
	});

	public void mainThread() {
		long start = System.currentTimeMillis();
	
		
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: "+(end - start));
		System.out.println("list1 size: "+list1.size());
		System.out.println("list2 size: "+list2.size());
	}

}
