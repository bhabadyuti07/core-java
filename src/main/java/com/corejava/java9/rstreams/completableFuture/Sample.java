package com.corejava.java9.rstreams.completableFuture;

import java.util.concurrent.CompletableFuture;

public class Sample {
	
	public static int compute() {
		System.out.println("compute :"+Thread.currentThread());
		return 2;
	}
	
	public static CompletableFuture<Integer> create() {
		//System.out.println("create :"+Thread.currentThread());
		return CompletableFuture.supplyAsync(() -> compute());
	}
	
	
	public static void main(String[] args) {
		create().thenAccept(data -> printIt(data));
	}

	private static void printIt(Integer data) {
		System.out.println(data);
		System.out.println("printIt :"+Thread.currentThread());
	}

}
