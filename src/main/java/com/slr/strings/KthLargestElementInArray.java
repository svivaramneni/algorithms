package com.slr.strings;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class KthLargestElementInArray {

	public static void main(String[] args) {

		int[] arr = new int[]{3, 2, 1, 5, 6, 4};

		int a = findKthLargest(arr, 3);

		System.out.println(a);
	}

	private static int findKthLargest(int[] arr, int k) {

		int n = arr.length;
		int left = 0;
		int right = n - 1;

		Random rand = new Random(0);

		while (left <= right) {
			int choosenPivotIndex = rand.nextInt(right - left + 1) + left;

			int finalIndexOfChoosenPivot = partition(arr, left, right, choosenPivotIndex);

			if (finalIndexOfChoosenPivot == n - k) {
				return arr[finalIndexOfChoosenPivot];
			} else if (finalIndexOfChoosenPivot > n - k) {
				right = finalIndexOfChoosenPivot - 1;
			} else {
				left = finalIndexOfChoosenPivot + 1;
			}


		}
		return -1;

	}

	private static int partition(int[] arr, int left, int right, int pivotIndex) {

		int pivotValue = arr[pivotIndex];

		int lesserItemsTailIndex = left;

		swap(arr, pivotIndex, right);

		for (int i = left; i < right; i++) {
			if (arr[i] < pivotValue) {
				swap(arr, i, lesserItemsTailIndex);
				lesserItemsTailIndex++;
			}
		}
		swap(arr, right, lesserItemsTailIndex);

		return lesserItemsTailIndex;
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
