package com.corejava.others;

public  class AbstractEx1 {
	
	private static boolean isUpdate = false;
	
	public static void demo(){
		System.out.println("Hello");
	}

	private static boolean display(){
		return isUpdate = true;
	}
	public static void main(String[] args) {

		int j=-1, x=4;
		switch (x) {
			case 0:
				j=1;
			case 2:
				j=2;
			default:
				j=0;
		}
		System.out.println(j);
	}

}
