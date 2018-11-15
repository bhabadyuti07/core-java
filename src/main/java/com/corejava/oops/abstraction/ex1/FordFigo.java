package com.corejava.oops.abstraction.ex1;

public class FordFigo extends FordModel {


	@Override
	public void setEngine() {
		System.out.println(" FordFigo Engine has been set");
	}

	@Override
	public void setColor() {
		System.out.println("FordFigo Color has been set");
	}

	@Override
	public void setTires() {
		System.out.println("FordFigo Tires has been set");
	}

}
