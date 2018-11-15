package com.corejava.oops.abstraction.ex1;

public class FordMustang extends FordModel {


	@Override
	public void setEngine() {
		System.out.println("FordMustang Engine has been set");
	}

	@Override
	public void setColor() {
		System.out.println("FordMustang Color has been set");
	}

	@Override
	public void setTires() {
		System.out.println("FordMustang Tires has been set");
	}

}
