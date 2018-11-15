/**
 * 
 */
package com.corejava.others;

/**
 * @author Bhabadyuti Bal
 *
 */
public class SingletonEx1 {
	
	SingletonEx1 instance = null;
	
	private SingletonEx1(){
		
	}
	
	public SingletonEx1 getInstance(SingletonEx1 obj) {
		if(obj != null) {
			obj = new SingletonEx1();
		}
		return instance;
	}
	
}
