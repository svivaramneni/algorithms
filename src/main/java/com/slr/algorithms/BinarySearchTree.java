package com.slr.algorithms;

/**
 * Recursion is the key here.
 */
public class BinarySearchTree {

	BinarySearchTreeNode root;

	public void insert(int data) {
		if (this.root == null) {
			this.root = new BinarySearchTreeNode(data);
		} else {
			insertNode(this.root, data);
		}
	}

	private void insertNode(BinarySearchTreeNode currentNode, int data) {
		if (currentNode.getData() > data) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(new BinarySearchTreeNode(data));
			} else {
				insertNode(currentNode.getLeft(), data);
			}
		} else {
			if (currentNode.getRight() == null) {
				currentNode.setRight(new BinarySearchTreeNode(data));
			} else {
				insertNode(currentNode.getRight(), data);
			}
		}
	}


	public BinarySearchTreeNode search(int data) {
		if (this.root == null) {
			return null;
		}
		if (this.root.getData() == data) {
			return this.root;
		}
		return searchNode(this.root, data);
	}

	private BinarySearchTreeNode searchNode(BinarySearchTreeNode root, int data) {
		if (root.getData() == data) {
			return root;
		} else if (root.getData() > data) {
			return searchNode(root.getLeft(), data);
		} else {
			return searchNode(root.getRight(), data);
		}
	}
}
