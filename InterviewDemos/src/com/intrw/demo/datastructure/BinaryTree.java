package com.intrw.demo.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int dataInp) {
			data = dataInp;
			left = null;
			right = null;

		}
	}
	
	public Node root;
	
	public BinaryTree(int rootData) {
		root = new Node(rootData);
		
	}
	
	public void insert(int dataInp) {
		Node newNode = new Node(dataInp);
		Queue<Node> q = new LinkedList<BinaryTree.Node>();
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			if(temp.left == null) {
				temp.left = newNode;
				return;
			} 
			else if(temp.right == null) {
				temp.right = newNode;
				return;
			} else {
				q.add(temp.left);
				q.add(temp.right);
			}
		}
	}
	

	public static void main(String[] args) {

	}

}
