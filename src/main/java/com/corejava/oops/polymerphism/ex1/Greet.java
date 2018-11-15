package com.corejava.oops.polymerphism.ex1;

public class Greet {
	
	
	
	public static void main(String[] args) {
		
		EventService eventService = new EventService();
		BirthdayGreetingImpl birthdayGreetingImpl = new BirthdayGreetingImpl();
		eventService.getGreetingServie(birthdayGreetingImpl);
	}

}
