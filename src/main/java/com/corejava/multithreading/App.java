package com.corejava.multithreading;

public class App {

	public static void main(String[] args){
		System.out.println("availableProcessors: "+Runtime.getRuntime().availableProcessors());
        MyThread b = new MyThread();
        //b.start();
        System.out.println(Thread.currentThread().getName());
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
                System.out.println("Notified...");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println("Total is: " + b.total);
        }
    }
		
	

}
