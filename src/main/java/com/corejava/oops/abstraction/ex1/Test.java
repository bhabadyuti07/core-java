package com.corejava.oops.abstraction.ex1;

public class Test {
	
	public static void main(String[] args) {
		
		String fordModel = FordEcoSports.getFordModel();
		FordEcoSports fordEcoSports = new FordEcoSports(fordModel);
		fordEcoSports.setEngine();
		fordEcoSports.setColor();
		fordEcoSports.setTires();
	}

}
