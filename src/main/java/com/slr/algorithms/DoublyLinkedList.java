package com.slr.algorithms;

public class DoublyLinkedList {

	//private int data;
	private DNode head;
	//private DNode tail;

	public void addNodeAtHead(int data) {
		DNode newNode = new DNode(data);
		DNode currentHead = this.head;
		if(currentHead != null) {
			newNode.setNextNode(this.head);
			currentHead.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	public void deleteNodeAtHead() {

	}

	public void sort() {
		DNode current = this.head;

		if(current.getData() > current.getNextNode().getData()) {

			DNode nxtNode = current.getNextNode();
			nxtNode.getPreviousNode();

		}


	}
}
