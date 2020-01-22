package com.corejava.dp;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance ;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured during singleton instance creation");
		}
	}
	
	//global access point
	public StaticBlockSingleton getInstance() {
		return instance;
	}
}
