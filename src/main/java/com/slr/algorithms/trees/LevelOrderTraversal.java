package com.slr.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */

public class LevelOrderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		//System.out.println(isValidBST(root));

	}

	public static List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		levelOrderHelper(root, 0, result);
		return result;
	}

	private static void levelOrderHelper(TreeNode node, int level, List<List<Integer>> result) {
		//start level
		if(result.size() == level) {
			result.add(new ArrayList<>());
		}

		result.get(level).add(node.val);

		if(node.left !=null) {
			levelOrderHelper(node.left, level +1, result);
		}

		if(node.right !=null) {
			levelOrderHelper(node.right, level +1, result);
		}

	}

	int maxValue;

	public int maxPathSum(TreeNode root) {
		maxValue = Integer.MIN_VALUE;
		maxPathDown(root);
		return maxValue;
	}

	private int maxPathDown(TreeNode node) {
		if (node == null) return 0;
		int left = Math.max(0, maxPathDown(node.left));
		int right = Math.max(0, maxPathDown(node.right));
		maxValue = Math.max(maxValue, left + right + node.val);
		return Math.max(left, right) + node.val;
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
