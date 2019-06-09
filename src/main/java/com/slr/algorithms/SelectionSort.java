package com.slr.algorithms;

/**
 * Selection Sort : Time complexity : O(n^2)
 * Finds the minimum element (considering ascending order) from unsorted array and puts it at the beginning in each loop
 */
public class SelectionSort {

	public int[] sortElements(int[] numbers) {
		int n = numbers.length;

		// One by one move boundary of unsorted sub numbers array
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted numbers array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (numbers[j] < numbers[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first 
			// element 
			int temp = numbers[min_idx];
			numbers[min_idx] = numbers[i];
			numbers[i] = temp;
		}
		return numbers;
	}

	void printnumbersay(int numbers[])
	{
		int n = numbers.length;
		for (int i=0; i<n; ++i)
			System.out.print(numbers[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		SelectionSort ss = new SelectionSort();
		int numbers[] = {64,25,12,22,11};
		System.out.println("Unsorted numbers");
		ss.printnumbersay(numbers);

		ss.sortElements(numbers);

		System.out.println("Sorted numbers");
		ss.printnumbersay(numbers);
	}
}
