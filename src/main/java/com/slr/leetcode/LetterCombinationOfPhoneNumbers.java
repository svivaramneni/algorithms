package com.slr.leetcode;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
public class LetterCombinationOfPhoneNumbers {

	public static void main(String[] args) {
		int[] arr = {3, 2, 2, 3};

		System.out.println(letterCombinations("23"));
	}

	public static List<String> letterCombinations(String digits) {

		String[] arr = new String[digits.length()];

		//switch and find mapping letters per digit, store them in array of strings
		for (int i = 0; i < digits.length(); i++) {
			char c = digits.charAt(i);

			switch (c) {
				case '2':
					arr[i] = "abc";
					break;
				case '3':
					arr[i] = "def";
					break;
				default:
					throw new IllegalArgumentException("not a valid digit input");
			}
		}

		//loop through the array and for each character in array, match it with every other character in other array elements.

		List<String> result = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			char[] cArray = arr[i].toCharArray();

			for (int j = 0; j < cArray.length; j++) {

				for (int k = arr.length - 1; k > i; k--) {
					char[] cArray2 = arr[k].toCharArray();

					for (int l = 0; l < cArray2.length; l++) {
						StringBuilder sb = new StringBuilder();
						sb.append(cArray[j]);
						sb.append(cArray2[l]);
						result.add(sb.toString());
					}
				}
			}
		}
		return result;
	}
}
