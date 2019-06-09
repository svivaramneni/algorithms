package com.slr.algorithms;

public class LinkedListDemo {

	public static void main (String[] args) {
		LinkedList ls = new LinkedList();
		ls.insertNodeAtHead(5);
		ls.insertNodeAtHead(10);
		ls.insertNodeAtHead(2);
		ls.insertNodeAtHead(12);
		ls.insertNodeAtHead(19);

		System.out.println("Length :" +ls.getLength());
		System.out.println("Find :" +ls.find(12));
	}
}
