package com.corejava.impl.smssender;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	private BlockingQueue<String> queue;
	
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while(true) {
				if(queue.size() == 0) {
					System.out.println("Queue is empty- sleeping for a while");
					Thread.sleep(1000);
					continue;
				}
				sendSMS(queue.take());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	public void sendSMS(String string) {
		System.out.println("consumed - "+string);
	}

}
