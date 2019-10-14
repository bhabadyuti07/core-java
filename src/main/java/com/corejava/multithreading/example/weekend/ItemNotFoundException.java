/**
 * 
 */
package com.corejava.multithreading.example.weekend;

/**
 * @author 1176119
 *
 */
public class ItemNotFoundException extends RuntimeException {
	
	/*
	 * An unchecked exception to indicate that a specific item is not found  
	 */

	private static final long serialVersionUID = 1L;
	
	public ItemNotFoundException(String message) {
		super(message);
	}

}
