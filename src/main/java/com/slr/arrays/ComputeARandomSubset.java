package com.slr.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Write a program that returns a size-k subset.
 * All subsets should be equally likely and all permutations of the
 * array should be equally likely.
 */
public class ComputeARandomSubset {

	public static void main(String[] args) {

		int[] a = new int[]{0, 1, 2, 3, 4};
		//subset size = k. k<=n;


		List<Integer> b = getRandomSubset(10, 3);

		System.out.println(b);
	}

	private static List<Integer> getRandomSubset(int n, int k) {

		Map<Integer, Integer> changedElements = new HashMap<>();

		Random randomIdxGen = new Random();

		for (int i = 0; i < k; i++) {
			//Generate random int in [i, n-1]
			int randIdx = i + randomIdxGen.nextInt(n - i);
			Integer ptr1 = changedElements.get(randIdx);
			Integer ptr2 = changedElements.get(i);

			if (ptr1 == null && ptr2 == null) {
				changedElements.put(randIdx, i);
				changedElements.put(i, randIdx);
			} else if (ptr1 == null && ptr2 != null) {
				changedElements.put(randIdx, ptr2);
				changedElements.put(i, randIdx);
			} else if (ptr1 != null && ptr2 == null) {
				changedElements.put(i, ptr1);
				changedElements.put(randIdx, i);
			} else {
				changedElements.put(i, ptr1);
				changedElements.put(randIdx, ptr2);
			}

		}

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < k; ++i) {
			result.add(changedElements.get(i));
		}
		return result;
	}
}
