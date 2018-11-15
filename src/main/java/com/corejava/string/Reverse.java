package com.corejava.string;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		reverse(input);
		sc.close();
	}

	private static void reverse(String input) {
		System.out.println("input string : "+input);
		if (input != null) {
			int length = input.length();
			char[] ch = new char[length];
			for (int i = 0; i < length; i++) {
				ch[i] = input.charAt(length - (i+1));
				System.out.println("ch["+i+"] - "+ch[i]);
			}
			System.out.println(String.valueOf(ch));
		}
				
	}

}
