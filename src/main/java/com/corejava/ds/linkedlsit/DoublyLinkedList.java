package com.corejava.ds.linkedlsit;

import org.omg.CORBA.Current;

public class DoublyLinkedList {

	private static Node head;
	//In a static inner class all memebers are staic in nature by default
	private static class Node {
		int data;
		Node next;
		Node prev;
		//constructor to  set the data
		public Node(int data) {
			this.data = data;
		}
		
	}

    public static void main(String[] args) {
		
    	//Initialize the data with 3 ndoes
    	head = new Node(1);
    	Node node2 = new Node(2);
    	Node node3 = new Node(3);
    	
    	head.prev = null;
    	head.next = node2;
    	
    	node2.prev = head;
    	node2.next = node3;
    	
    	node3.prev = node2;
    	node3.next = null;
    	
    	//insertAtFirst(new Node(100));
    	//insertAtLast(new Node(100));
    	insertBefore(node2, new Node(100));
    	traverseList();
    	
    	
	}
    
    //Time Complexity: O(1)
    private static void insertAtFirst(Node node) {
    	if (head == null) {
    		head = node;
    		return;
    	}
    	Node currentNode = head;
    	currentNode.prev = node;
    	node.next = currentNode;
    	head = node;
    }
    
    //Time Complexity: O(1)
    private static void insertAfter(Node givenNode, Node node) {
    	if (head == null) {
    		head = node;
    		return;
    	}
    	Node nextNode = givenNode.next;
    	givenNode.next = node;
    	node.next = nextNode;
    	nextNode.prev = node;
    	
    }
    
  //Time Complexity: O(1)
    private static void insertBefore(Node givenNode, Node node) {
    	if (head == null) {
    		head = node;
    		return;
    	}
    	Node prevNode = givenNode.prev;
    	prevNode.next = node;
    	node.prev = prevNode;
    	node.next = givenNode;
    			
    }
    
  //Time Complexity: O(n)
    private static void insertAtLast(Node node) {
    	if (head == null) {
    		head = node;
    		return;
    	}
    	Node currentNode = head;
    	while(currentNode != null) {
    		currentNode = currentNode.next;
    		if(currentNode.next == null) {
    			currentNode.next = node;
    			node.next = null;
    			node.prev = currentNode;
    			break;
    		}
    	}
    }

	private static void traverseList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
		
	}

}
