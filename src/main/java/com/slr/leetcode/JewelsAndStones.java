package com.slr.leetcode;

/**
 * https://leetcode.com/problems/jewels-and-stones/description/
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		String j = "aA";
		String s = "aAAbbbb";

		System.out.println(numJewelsInStones(j, s));
		System.out.println(numJewelsInStones("z", "ZZ"));
	}

	public static int numJewelsInStones(String j, String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (j.indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}

}
