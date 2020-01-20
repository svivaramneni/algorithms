package com.slr.geeks;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 1
 * /   \
 * 2     3
 * / \   / \
 * 4  5   6   7
 * \   \
 * 8   9
 * <p>
 * <p>
 * Output:
 * Vertical order traversal is
 * 4
 * 2
 * 1 5 6
 * 3 8
 * 7
 * 9
 */

public class PrintBinaryTreeVerticalOrder {

	private static void printVerticalOrderHelper(Node root, Map<Integer, Integer> nodeDistanceMap, int distance) {
		if (root == null) {
			return;
		}
		nodeDistanceMap.put(root.key, distance);
		printVerticalOrderHelper(root.left, nodeDistanceMap, distance - 1);
		printVerticalOrderHelper(root.right, nodeDistanceMap, distance + 1);
	}

	private static void printVerticalOrder(Node root) {

		Map<Integer, Integer> nodeDistanceMap = new TreeMap<>();
		printVerticalOrderHelper(root, nodeDistanceMap, 0);
		//sort treemap by values
		Map sortedMap = sortByValues(nodeDistanceMap);

		//Go through map and print them.
		int previous = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : nodeDistanceMap.entrySet()) {
			if (previous != entry.getValue()) {
				System.out.println();
				previous = entry.getValue();
			}
			System.out.println(entry.getKey());
		}

	}

	public static <K, V extends Comparable<V>> Map<K, V>
	sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator =
				new Comparator<K>() {
					public int compare(K k1, K k2) {
						int compare =
								map.get(k1).compareTo(map.get(k2));
						if (compare == 0)
							return 1;
						else
							return compare;
					}
				};

		Map<K, V> sortedByValues =
				new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}


	// Driver program to test above functions
	public static void main(String[] args) {

		// TO DO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		System.out.println("Vertical Order traversal is");
		printVerticalOrder(root);
	}


	// Tree node
	static class Node {
		int key;
		Node left;
		Node right;

		// Constructor
		Node(int data) {
			key = data;
			left = null;
			right = null;
		}
	}


}
