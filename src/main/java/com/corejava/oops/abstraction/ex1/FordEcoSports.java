package com.corejava.oops.abstraction.ex1;

public class FordEcoSports extends FordModel {
	
	private String model;
	
	public FordEcoSports() {
	}
	
	public FordEcoSports(String model) {
		System.out.println("FordEcoSports model has been set");
		this.model = model;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void setEngine() {
		System.out.println("FordEcoSports Engine has been set");
	}

	@Override
	public void setColor() {
		System.out.println("FordEcoSports Color has been set");
	}

	@Override
	public void setTires() {
		System.out.println("FordEcoSports Tires has been set");
	}

}
