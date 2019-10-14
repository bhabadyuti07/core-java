/**
 * 
 */
package com.corejava.multithreading.example.weekend;

/**
 * @author 1176119
 *
 */
public class WeekendMultiWorker {
	
	boolean isShoppingDone, isCleaningDone, isCookingDone = false;
	
	public void doShopping() throws InterruptedException {
		System.out.println("Shopping...");
		Thread.sleep(5000);
		isShoppingDone = true;
	}
	
	public void doCleaning() throws InterruptedException {
		System.out.println("Cleaning...");
		Thread.sleep(5000);
		isCleaningDone = true;
	}
	
	public void doCooking() throws InterruptedException {
		System.out.println("Cooking...");
		Thread.sleep(5000);
		isCookingDone = true;
	}
	
	Runnable cooking = () -> {
		try {
			doCooking();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	
	Runnable shopping = () -> {
		try {
			doShopping();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	
	Runnable cleaning = () -> {
		try {
			doCleaning();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	
	
	public void process() throws InterruptedException {
		System.out.println("Day started!");
		long startTime = System.currentTimeMillis();
		Thread cookingGuy = new Thread(cooking);
		cookingGuy.start();
		
		Thread cleaningGuy = new Thread(cleaning);
		cleaningGuy.start();
		
		Thread shoppingGuy = new Thread(shopping);
		shoppingGuy.start();
		
		while(true) {
			if ((isShoppingDone == true) && (isCleaningDone == true) && (isCookingDone == true)) {
				break;
			}
			Thread.sleep(1);
		}
		
		System.out.println("Day end!");
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+((endTime - startTime)/1000)+" secs");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WeekendMultiWorker event = new WeekendMultiWorker();
		event.process();
	}

}
