package com.slr.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestFilePath {

	public static void main(String[] args) {

		String s2 = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";

		System.out.println(lengthLongestPath(s2));

	}

	public static int lengthLongestPath(String input) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(0); // "dummy" length
		int maxLen = 0;
		String[] arr = input.split("\n");
		for (String s : arr) {
			System.out.println("String : "+s);
			int lev = s.lastIndexOf("\t") + 1; // number of "\t"
			System.out.println("lev : "+lev);
			while (lev + 1 < stack.size()) {
				System.out.println("Popped : " +stack.pop()); // find parent
			}
			int len = stack.peek() + s.length() - lev + 1; // remove "/t", add"/"
			System.out.println("length : "+len);
			stack.push(len);
			// check if it is file
			if (s.contains(".")) {
				maxLen = Math.max(maxLen, len - 1);
				System.out.println("Max Length : "+maxLen);
			}
		}
		return maxLen;
	}
}



