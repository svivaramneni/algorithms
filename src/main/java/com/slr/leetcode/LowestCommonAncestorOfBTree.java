package com.slr.leetcode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 */
public class LowestCommonAncestorOfBTree {


	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		root.left.right.left = new TreeNode(3);
		root.left.left.right = new TreeNode(5);

		System.out.println(lowestCommonAncestor(root, root.left, root.right));
		System.out.println(lowestCommonAncestor(root, root.left, root.left.right));
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (p.data < root.data && q.data < root.data) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (p.data > root.data && q.data < root.data) {
			return lowestCommonAncestor(root.right, p, q);
		} else {
			return root;
		}

	}


	public static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}

		@Override
		public String toString() {
			return "TreeNode{" +
					"data=" + data +
					'}';
		}
	}

}
