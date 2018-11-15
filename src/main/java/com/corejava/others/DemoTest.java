package com.corejava.others;

public class DemoTest {

	public static void checkImmutable(){
		int id = 5;
		String name = "Hocky";
		Age age = new Age();
		age.setDay(1);
		age.setMonth(10);
		age.setYear(1990);
		Immutability ob = new Immutability(id, name, age);
		//ob.setI(++i);
		//name = name.concat(" India");
		//ob.setName(name);
		System.out.println("Alex age year before modification = " + ob.getAge().getYear());
		age.setYear(1989);
		System.out.println("Alex age year after modification = " + ob.getAge().getYear());
		System.out.println(ob.getName());
	}
	
	public static void checkSingleton() {
		
	}
	
	public static void checkEquals() {
		/*	String ex1 = new String("abc");
			String ex2 = new String("abc");
			Age age1 = new Age("bhaba");
			Age age2 = new Age("bhaba");
			System.out.println(ex1.equals(ex2));
			System.out.println(age1.equals(age2));
			System.out.println(ex1 == ex2);*/
			//new DemoTest().show();
	}
	
	public static void main(String[] args) {
		checkEquals();
	}


}
