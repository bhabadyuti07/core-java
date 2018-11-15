/**
 * 
 */
package com.corejava.problemsolving;

/**
 * @author Bhabadyuti Bal
 *
 */
public class ArmstrongNumber {
	
	public boolean checkArmstrong(int number) {
		int sum = 0;
		String numStr = String.valueOf(number);
		for (int i = 0; i < numStr.length(); i++) {
			int digit = Character.getNumericValue(numStr.charAt(i));
			sum += Math.pow(digit, numStr.length());
		}
		if (sum == number) {
			System.out.println("Armstrong Number");
			return true;
		} else {
			System.out.println("Not Armstrong Number");
		}
		return false;
	}

	
	public static void main(String[] args) {
		new ArmstrongNumber().checkArmstrong(1583);
	}
}
