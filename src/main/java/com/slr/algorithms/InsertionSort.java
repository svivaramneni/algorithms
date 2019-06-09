package com.slr.algorithms;

/**
 * Similar to how we draw and arrange cards.
 * Starts at right and compares with element on left and creates a space if the number
 * is smaller by changing its current position to right
 * Time Complexity : O(n^2)
 */

public class InsertionSort {

	public int[] sort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int j = i - 1;
			int k = numbers[i];

			while (j >= 0 && k < numbers[j]) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = k;
		}
		return numbers;
	}


	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = {5, 2, 8, 12, 7, 1};

		InsertionSort is = new InsertionSort();
		is.sort(arr);

		printArray(arr);
	}

}
