package com.intrw.demo.datastructure;

public class Queue {

	class Node {
		String item;
		Node behind;
	}

	public Node head = null;
	public Node tail = null;

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void enqueue(String str) {

		if (head == null) {
			head = new Node();
			head.item = str;
			tail = head;
			return;
		}

		tail.behind = new Node();
		tail.behind.item = str;
		tail = tail.behind;
	}

	public String dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			String returnVal = head.item;
			head = head.behind;
			return returnVal;
		}
	}

	public static void main(String[] args) {

		Queue myQue = new Queue();
		//System.out.println(myQue.isEmpty());
		
		myQue.enqueue("String A");
		myQue.enqueue("String B");
		myQue.enqueue("String C");

		System.out.println(myQue.isEmpty());
		
		System.out.println(myQue.dequeue());
		
	}

}
