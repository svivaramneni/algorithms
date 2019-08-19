package com.slr.leetcode;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumberConstantSpace {


	public static void main(String[] args) {
		int[] arr1 = {3, 0, 1};
		System.out.println(missingNumber(arr1));
	}


	public static int missingNumber(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		int n = nums.length + 1;
		return ((n * (n - 1) / 2) - sum);

	}
}
