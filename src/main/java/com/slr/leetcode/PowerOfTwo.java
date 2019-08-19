package com.slr.leetcode;

/**
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(218));
	}


	public static boolean isPowerOfTwo(int n) {

		if (n < 1)
			return false;

		if (n == 1) {
			return true;
		}

		int result = 2;

		while (n >= result) {
			if (n % result != 0) {
				return false;
			}
			result = result * 2;
		}

		return true;

	}
}
