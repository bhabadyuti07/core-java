package com.corejava.oops.polymerphism;

class AA {
	public AA() {
		System.out.println("AA called...");
	}
	
	public void display() {
		System.out.println("display A...");
	}
}


class BB extends AA {
	
	public BB() {
		System.out.println("BB called...");
	}
	
	public void display() {
		System.out.println("display B...");
	}
}


public class Polymerphism {
	
	
	public static void main(String[] args) {
		AA ob = new BB();
		ob.display();
	}

}
