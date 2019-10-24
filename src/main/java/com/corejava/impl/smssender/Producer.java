package com.corejava.impl.smssender;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while(true) {
				//Thread.sleep(1000);
				queue.put(smsGenerator());
				System.out.println("Produced..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Set<String> findSMSByNewStatus() {
		//return a list of NEW sms
		Set<String> allNewSms = new HashSet<>();
			int count = 1;
			while(count < 10) {
				String newSMS = smsGenerator();
				allNewSms.add(newSMS);
			}
			
		return allNewSms;
	}
	
	public String smsGenerator() {
		byte[] array = new byte[10];
		new Random().nextBytes(array);
		String randomString = new String(array);
		StringBuilder sb = new StringBuilder(randomString).append("-NEW");
		return sb.toString();
	}
	

}
