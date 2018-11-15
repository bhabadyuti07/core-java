package com.corejava.others;

public class ObjectMethods implements Vehicle, Interface2{
	
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		Vehicle i1 = new ObjectMethods();
		ObjectMethods ob2 = new ObjectMethods();
		System.out.println(ob2.toString());
	}

	@Override
	public String create() {
		return "create method";
		
	}

}
