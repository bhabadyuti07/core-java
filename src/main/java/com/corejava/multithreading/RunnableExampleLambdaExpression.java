package com.corejava.multithreading;

public class RunnableExampleLambdaExpression {
	
	public static void main(String[] args) {
System.out.println("Inside: "+Thread.currentThread().getName());
		
		System.out.println("Creating Runnable...");		
		Runnable runnable = () -> {
				System.out.println("Inside: "+Thread.currentThread().getName());
		};
		
		System.out.println("Creating the thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting the thread...");
		thread.start();
		
	}

}
