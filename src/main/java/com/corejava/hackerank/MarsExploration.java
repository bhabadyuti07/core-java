/**
 * 
 */
package com.corejava.hackerank;

import java.util.Arrays;

/**
 * @author Bhabadyuti Bal
 *	https://www.hackerrank.com/challenges/mars-exploration/problem
 */
public class MarsExploration {
	
	final static String fixedToken = "SOS";
	static int count = 0;
	
	public static int marsExploration(String input){
		String[] tokens = input.split("(?<=\\G...)");
		System.out.println(tokens.toString());
		Arrays.stream(tokens).forEach(token -> {
			if (!token.equals(fixedToken)) {
				count++;
			}
		});
		return count;
	}

	
	public static void main(String[] args) {
		String input = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
		System.out.println(marsExploration(input));
	}
	
}
