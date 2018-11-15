package com.corejava.others;

import java.util.Scanner;

public class Palindrom {
	
	static boolean checkPalindrom1(String str) {
		if(str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		}
		StringBuilder sb = new StringBuilder(str);
		if(sb.reverse().toString().equals(str)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter string to check for palindrom:");
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		boolean isPalindrom = checkPalindrom1(nextLine);
		System.out.println(nextLine+" - "+isPalindrom);
	}
}
