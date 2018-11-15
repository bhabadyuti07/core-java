package com.corejava.others;

public interface Vehicle  {
	
	
	static String producer() {
	    return "N&F Vehicles";
	}
	

	default String getOverview() {
		return  "ATV made by " + producer();
	}
	
	
	default String getSpecification() {
		return  "Hign standard tire ";
	}
}
