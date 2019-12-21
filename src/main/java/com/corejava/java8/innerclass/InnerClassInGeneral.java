/**
 * 
 */
package com.corejava.java8.innerclass;

/**
 * @author Bhabadyuti Bal
 *
 */
public class InnerClassInGeneral {
	
	
	public static void main(String[] args) {
		
		Thread t = new Thread() {
			@Override
			public void run() {
				
			}
		};
		t.start();
		
		Runnable runnable = () -> {
			
			System.out.println();
		};
		
	}
	
	
	

}
