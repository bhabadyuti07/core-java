package com.corejava.multithreading;

public class MyThread extends Thread {
	
	int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            System.out.println("tatal is: "+total);
            notify();
        }
    }

    public static void main(String args[]) {
        new MyThread().start();
        new MyThread().start();
    }

}
