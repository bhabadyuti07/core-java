package com.corejava.others;

import java.util.Scanner;

public class Factorial {
	
	public static int getFactorial(int num) {
		if(num > 1) {
			num = num * getFactorial(num - 1);
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number to find factorial:");
		Scanner sc = new Scanner(System.in);
		int factNum = sc.nextInt();
		int factVal = getFactorial(factNum);
		System.out.println(factNum+"! = "+factVal);
	}

}
