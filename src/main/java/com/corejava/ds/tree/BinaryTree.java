package com.corejava.ds.tree;

/*
 * A Tree can be represented by using a DLL
 */
public class BinaryTree {
	
	static Node root;
	
	public static void insert(int data){
		root =  insertNodeRecursively(root, 15);
	}
	
	public static void main(String[] args) {
		
		Node root = null; //initially tree will have null
		insert(15);
		insert(10);
		insert(20);
		traverseBT();
	}
	
	private static Node insertNodeRecursively(Node node, int data) {
		if (root == null) {
			root = new Node(data);
		} else if(data <= node.data) { //check to insert as left child
			node.left = insertNodeRecursively(node.left, data);
		} else if(data > node.data) {
			node.right = insertNodeRecursively(node.right, data);
		}
		return node;
	}
	
	private static void deleteNode(Node node){
		if(node == null) return;
	}

	private static void traverseBT() {
		
	}

}
