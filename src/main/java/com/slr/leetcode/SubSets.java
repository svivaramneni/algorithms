package com.slr.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

	public static void main(String[] args) {

		int[] inputArray = {1, 2, 3};
		List<List<Integer>> subsets2 = subsets(inputArray);
		System.out.println(subsets2);
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();

		if (nums == null) {
			return subsets;
		}

		int index = 0;

		subsetsRecursion(nums, index, new ArrayList<Integer>(), subsets);

		return subsets;
	}

	public static void subsetsRecursion(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {

		subsets.add(new ArrayList<>(current));

		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			subsetsRecursion(nums, i + 1, current, subsets);
			current.remove(current.size() - 1);
			//index++;
		}
	}
}
