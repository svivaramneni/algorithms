package com.slr.algorithms;

/**
 * Bubble sort : Time complexity O(n^2)
 * Works by repeatedly swapping 2 adjacent elements if they are in wrong order.
 * <p>
 * Example:
 * First Pass:
 * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
 * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
 * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
 */

public class BubbleSort {

	public int[] sortElements(int[] numbers) {
		int temp;
		int n = numbers.length;
		for (int i = 0; i < n - 1; i++) { //For each inner loop highest number reaches end.
			for (int j = 0; j < n - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					//swap elements
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		return numbers;
	}
}
