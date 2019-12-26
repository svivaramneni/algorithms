package com.slr.algorithms.trees;

public class BinaryTreeDiameter {

	static int diameter = 0;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(diameterOfBinaryTree(root));
	}


	  static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }

	}

	public static int diameterOfBinaryTree(TreeNode root) {
		diameter = 1;

		depth(root);

		return diameter-1;
	}

	public static int depth(TreeNode root) {

		if(root == null) {
			return 0;
		}
		int l = depth(root.left);
		int r = depth(root.right);

		diameter = Math.max(diameter, l+r+1);
		return Math.max(l, r) + 1;
	}
}
