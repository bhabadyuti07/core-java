package com.corejava.multithreading;

public class MyThread extends Thread{
	
	int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            System.out.println(Thread.currentThread().getName());
            notify();
        }
    }

}
