/**
 * 
 */
package com.corejava.ds.linkedlsit;

/**
 * @author Bhabadyuti Bal
 * 
 * @see This Node represents each element of a linked list with the content data|next
 *
 */
public class Node {
	
	int data;
	Node next;
	Node prev;//for doubly linked list
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	/**
	 * @param data
	 * @param next
	 */
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * @param data
	 * @param next
	 * @param prev
	 */
	public Node(int data, Node next, Node prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	

}
