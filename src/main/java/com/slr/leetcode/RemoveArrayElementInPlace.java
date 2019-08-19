package com.slr.leetcode;

/**
 * https://leetcode.com/problems/remove-element/description/
 */
public class RemoveArrayElementInPlace {

	public static void main(String[] args) {
		int[] arr = {3, 2, 2, 3};

		System.out.println(removeValueInplace(arr, 3));

	}

	public static int removeValueInplace(int[] nums, int value) {
		int index = 0;
		for (int i : nums) {
			if (nums[i] != value)
				nums[index++] = nums[i];
		}

		return index;
	}

}
