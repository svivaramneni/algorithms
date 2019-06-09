package com.slr.algorithms;

public class DNode {

	private DNode previousNode;
	private int data;
	private DNode nextNode;


	public DNode(int data) {
		this.data = data;
	}

	public DNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DNode previousNode) {
		this.previousNode = previousNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DNode nextNode) {
		this.nextNode = nextNode;
	}
}
