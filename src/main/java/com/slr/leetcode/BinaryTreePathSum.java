package com.slr.leetcode;

/**
 * 5
 * 4   8
 * 11 13  4
 * 7  2
 * <p>
 * Sum = 22
 * https://leetcode.com/problems/path-sum/description/
 */
public class BinaryTreePathSum {


	public static void main(String[] args) {

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.right = new TreeNode(1);

		System.out.println(hasPathSum(root, 22));
	}


	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null && sum == root.data) {
			return true;
		}

		return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
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
	}
}
