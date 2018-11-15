package com.corejava.java8features.lamdas;

public class Greeter {
	
	
	
	public void greet(Greeting greeting) {
		//greeting.performGreetings(s);
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//Implemetation
		//Greeting greetingImpl = new SatsangGreetingImpl();
		//passing the thing that has the behavior, to greet method
		//greeter.greet(greetingImpl);
		
		Greeting lambdaGreeting = (s) -> {
			System.out.println("Lambda Greetings!");
		};
		
		lambdaGreeting.performGreetings("Hello");
		Greeting greeting = new Greeting() {

			@Override
			public void performGreetings(String s) {
				System.out.println(s);
				
			}
			
		};
		greeter.greet(greeting);
		
		//String  str = () -> {};
		//The return type of lamda needs to be a functional interface

	}

}

