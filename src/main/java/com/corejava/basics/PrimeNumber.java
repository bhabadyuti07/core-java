/**
 * 
 */
package com.corejava.basics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Bhabadyuti Bal
 *
 */
public class PrimeNumber<T> {
	
	public static Set<Integer> getPrimeNumbersBelowGivenNumber(double num) {
		
		Set<Integer> allNumbers = new HashSet<>();
		for (int i = 2; i < num; i++) {
			allNumbers.add(i);
		}
		
		Set<Integer> set = null;
		if (num > 0) {
			set = new HashSet<>();
			for (int i = 2; i < num; i++) {
				for (int j = 2; j <= i; j++) {
					if(i != j && (i % j == 0)) {
						set.add(i);
					}
				}
			}
			allNumbers.removeAll(set);
			return allNumbers;
		} 
		return null;
	}
	
	public static boolean isPrime(int num) {
		double sqrt = Math.round(Math.sqrt(num));
		System.out.println("sqrt :: "+sqrt);
		Set<Integer> primeNumbers = getPrimeNumbersBelowGivenNumber(sqrt);
		System.out.println("primeNumbers :: "+primeNumbers);
		for (Integer integer : primeNumbers) {
			if((num % integer) == 0) {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number ::");
		Scanner sc= new Scanner(System.in);
		try {
			if(sc.hasNext()) {
				int nextInt = sc.nextInt();
				System.out.println("Reminder - "+Float.valueOf(nextInt%2));
				System.out.println("Quotient - "+Float.valueOf(nextInt/2));
				isPrime(nextInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
