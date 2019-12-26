package com.slr.arrays;

import static java.lang.Math.abs;

public class SearchArrayElementsWithAjacencyDiffOne {

	public static void main(String[] args) {

		int[] arr = {5, 4, 5, 6, 5, 4, 3, 2};

		int x = 9;

		System.out.println(findOccurance(arr, x));
	}

	private static int findOccurance(int[] arr, int x) {

		int i = 0;

		while (i < arr.length) {

			if (arr[i] == x)
				return i;
			else {
				i = i + abs(arr[i] - x);
			}
		}

		return -1;
	}
}
