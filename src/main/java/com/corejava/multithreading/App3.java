package com.corejava.multithreading;

import java.util.Scanner;

class Processor1 extends Thread {
	
	private volatile boolean running = true;
	
	@Override
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		while(running) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
		System.out.println("shutdown called...");
	}
}

public class App3 {
	
	public static void main(String[] args) {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		Processor1 processor1 = new Processor1();
		processor1.start();
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		processor1.shutdown();
	}

}
