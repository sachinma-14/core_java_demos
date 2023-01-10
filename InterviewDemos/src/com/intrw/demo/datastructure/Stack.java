package com.intrw.demo.datastructure;

public class Stack {

	class Node {
		String item;
		Node next;
	}

	public Node top = null;

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public void push(String str) {
		Node oldTop = top;
		top = new Node();
		top.item = str;
		top.next = oldTop;
	}

	public String pop() {
		String returnValue = top.item;
		top = top.next;
		return returnValue;
	}
	
	public static void main(String args[]) {
		Stack myStack = new Stack();
		//System.out.println(myStack.isEmpty());
		
		myStack.push("String A");
		myStack.push("String B");
		myStack.push("String C");
		myStack.push("String D");
		
		System.out.println(myStack.isEmpty());
		
		System.out.println(myStack.pop());
	}

}
