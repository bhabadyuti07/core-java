/**
 * 
 */
package com.corejava.ds.linkedlsit;

/**
 * @author Bhabadyuti Bal
 * 
 * In this class will do various operations on linked list
 *
 */
public class LinkedList {
	
	static Node head;
	
	public static void main(String[] args) {
		
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();
		
		head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		/* Three nodes have been allocated  dynamically. 
        We have references to these three blocks as head,   
        node2 and node3 

        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  | null |     | 2  | null |     |  3 | null | 
       +----+------+     +----+------+     +----+------+ */
		
		//Link node2 to head
		head.next = node2;
		/*  Now next of first Node refers to second.  So they 
        	both are linked. 

	     llist.head        second              third 
	        |                |                  | 
	        |                |                  | 
	    +----+------+     +----+------+     +----+------+ 
	    | 1  |  o-------->| 2  | null |     |  3 | null | 
	    +----+------+     +----+------+     +----+------+ */
		
		//Link node3 to node2
		node2.next = node3;
		/*  Now next of second Node refers to third.  So all three 
        nodes are linked. 

	     llist.head        second              third 
	        |                |                  | 
	        |                |                  | 
	    +----+------+     +----+------+     +----+------+ 
	    | 1  |  o-------->| 2  |  o-------->|  3 | null | 
	    +----+------+     +----+------+     +----+------+ */
		node3.next = node4;
		//llist.printList();
		//llist.insertAtFirst(new Node(1000));
		//llist.insertAtlast(new Node(1000));
		//llist.insertAfter(node2, new Node(111));
		llist.deleteGivenNode(node2);
		
	}
	
	
	//insertion at first O(1)
	private void insertAtFirst(Node node) {
		Node currentNode = node;
		currentNode.next = head;
		head = currentNode;
		System.out.println("After insertion at first place...");
		traverseList();
	}
	
	//O(1)
	private void insertAfter(Node prevNode, Node newNode) {
		if(prevNode == null) {
			head = newNode;
			return;
		}
		Node currentNode = prevNode.next;
		prevNode.next = newNode;
		newNode.next = currentNode;
		traverseList();
	}
	
	
	private void insertAtlast(Node node) {
		if(head == null) {
			head = node;
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			currentNode = currentNode.next;
			if(currentNode.next == null) {
				currentNode.next = node;
				break;
			}
		}
		traverseList();
	}
	
	
	private void deleteGivenNode(Node node) {
		if(head == null || node == null)
			return;
		Node currentNode = head;
		while(currentNode != null) {
			if(currentNode.next != null && currentNode.next.data == node.data) {
				currentNode.next = node.next; //link the next node with the previous node
				node = null;
				break;
			}
			currentNode = currentNode.next;
		}
		traverseList();
	}



	private void traverseList() {
		//in order to print/access a linked list we have to get the head node
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}

}
