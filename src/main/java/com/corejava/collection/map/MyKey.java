package com.corejava.collection.map;

public class MyKey {

	private int id;
	
	public MyKey(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		System.out.println("calling MyKey hashcode ");
		return id;
	}
}
