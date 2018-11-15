package com.corejava.hackerank;

import java.util.Scanner;

public class CheckPalindrom {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        if(str.charAt(0) != str.charAt(str.length() - 1)){
	            System.out.println("No");
	            return;
	        }
	        if(str.length()%2 == 0) {
	            System.out.println("No");
	            return;
	        }
	        StringBuilder builder = new StringBuilder();
	        for(int i=0; i<str.length();i++){
	        	builder.append(str.charAt(str.length() - (i+1)));
	        }
	        if(builder.toString().equals(str)){
	        	System.out.println("Yes");
	        }
	}

}
