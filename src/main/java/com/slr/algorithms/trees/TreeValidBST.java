package com.slr.algorithms.trees;

public class TreeValidBST {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		//root.right = new TreeNode(8);

		System.out.println(isValidBST(root));

	}

	public static boolean isValidBST(TreeNode root) {

		if (root == null) {
			return true;
		}

		return isValidBSTRecursion(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean isValidBSTRecursion(TreeNode root, int minValue, int maxValue) {

		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}

		if ((root.left != null && root.val <= minValue) || (root.right != null && root.val > maxValue)) {
			return false;
		}

		return isValidBSTRecursion(root.left, minValue, root.val ) && isValidBSTRecursion(root.right, root.val, maxValue);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}


}



