package com.corejava.map;

public class MyKey {

	private int id;
	
	public MyKey() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param id
	 */
	public MyKey(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		System.out.println("calling hashcode...");
		return id;
	}
}
