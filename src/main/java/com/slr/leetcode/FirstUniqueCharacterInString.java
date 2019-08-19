package com.slr.leetcode;

import java.util.HashMap;

/**https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 */
public class FirstUniqueCharacterInString {

	public static void main(String[] args) {

		System.out.println(firstUniqueChar("leetcode"));
		System.out.println(firstUniqueChar("loveleetcode"));

	}

	public static int firstUniqueChar(String s) {
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> charmap = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!charmap.containsKey(c)) {
				charmap.put(c, i);
			} else {
				charmap.put(c, -1);
			}
		}

		int min = Integer.MAX_VALUE;

		for (char c : charmap.keySet()) {
			if (charmap.get(c) > -1 && charmap.get(c) < min) {
				min = charmap.get(c);
			}
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}
}
