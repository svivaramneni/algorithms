package com.slr.leetcode;

import java.util.HashMap;
import java.util.Map;

/**https://leetcode.com/problems/single-number/
 *
 */
public class SingleNumber {

	public static void main(String[] args) {

		int[] a1 = {2, 2, 1};
		int[] a2 = {4, 1, 2, 2, 1};

		System.out.println(singleNumber(a1));
		System.out.println(singleNumber(a2));
		//System.out.println(firstUniqueChar("loveleetcode"));

	}

	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> countsMap = new HashMap<>();

		for (int i : nums) {
			int count = countsMap.get(i) == null ? 1 : 2;
			countsMap.put(i, count);
		}

		for (Integer i : countsMap.keySet()) {
			if (countsMap.get(i) == 1) {
				return i;
			}
		}

		return 1;
	}
}
