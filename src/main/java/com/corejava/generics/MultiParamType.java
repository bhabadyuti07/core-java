/**
 * 
 */
package com.corejava.generics;

/**
 * @author Bhabadyuti Bal
 *
 */
class MultiParamType {

	public static void main(String[] args) {
		Check<String, Integer> multiParamTypeObj = new Check<String, Integer>("Test number ", 111);
		multiParamTypeObj.print();
	}
}


class Check<U, T> {
	
	U firstObject;
	T secObject;
	
	public Check(U firstObject, T secObject) {
		this.firstObject = firstObject;
		this.secObject = secObject;
	}
	
	public void print() {
		System.out.println("firstObject: "+firstObject);
		System.out.println("secObject: "+secObject);
	}
	
	
}
