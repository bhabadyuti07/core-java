/**
 * 
 */
package com.corejava.oops;

/**
 * @author Bhabadyuti Bal
 *
 */
public class MianApp implements InterfaceEx1, InterfaceEx2 {
	
	public static void main(String[] args) {
		InterfaceEx1Impl ex1Impl = new InterfaceEx1Impl();
		ex1Impl.display();
	}

	@Override
	public void display() {
		
		
	}

}
