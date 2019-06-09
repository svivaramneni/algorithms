package com.slr.algorithms;

public class LinkedList {
	private Node head;

	public void insertNodeAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int getLength() {
		int length = 0;
		Node current = this.head;
		while (current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}

	public void deleteHeadNode() {
		Node currentNode = this.head;
		if (currentNode != null) {
			this.head = currentNode.getNextNode();
		}
	}

	public void insertNodeAtTail(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = this.head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public Node find(int data) {
		Node current = this.head;
		while (current != null) {
			if (current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}


}
