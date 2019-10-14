package com.corejava.multithreading.example.weekend;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WeekendExecutor {
	
	public boolean doShopping() throws InterruptedException {
		boolean isShoppingDone = false;
		System.out.println("Shopping...");
		Thread.sleep(5000);
		try {
			throw new MetAnAccidentException("Met an accident on the way, need help!");
		} catch (Exception e) {
			isShoppingDone = false;
		}
		return isShoppingDone;
	}
	
	public boolean doCleaning() throws InterruptedException {
		System.out.println("Cleaning...");
		Thread.sleep(5000);
		return true;
	}
	
	public boolean doCooking() throws InterruptedException {
		System.out.println("Cooking...");
		Thread.sleep(5000);
		return true;
	}
	
	
	/*
	 * Why callable ?
	 * A Callable can return a value but a Runnable cannot.
	   A Callable can throw checked exception but a Runnable cannot.
	   A Callable can be used with ExecutorService#invokeXXX(Collection<? extends Callable<T>> tasks) 
	   methods but a Runnable cannot be.
	 */
	//List of predefined work to be done in an weekend
	public List<Callable<Boolean>> getAllTasks() {
		
		Callable<Boolean> cooking = () -> {
			return doCooking();
		};
		
		Callable<Boolean> shopping = () -> {
			return doShopping();
		};
		
		Callable<Boolean> cleaning = () -> {
			return doCleaning();
		};
		
		List<Callable<Boolean>> tasks = new ArrayList<>();
		tasks.add(cleaning);
		tasks.add(shopping);
		tasks.add(cooking);
		return tasks;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Day started!");
		long startTime = System.currentTimeMillis();
		ExecutorService service = Executors.newFixedThreadPool(3); 
		List<Future<Boolean>> futures = service.invokeAll(new WeekendExecutor().getAllTasks());
		for(Future<?> future: futures) {
			boolean done = future.isDone();
		}
		System.out.println("Day end!");
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+((endTime - startTime)/1000)+" secs");
	}

}
