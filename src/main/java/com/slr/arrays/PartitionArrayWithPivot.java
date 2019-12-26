package com.slr.arrays;

/**
 * Write a program that takes an array and an index, then all elements less than a[index] appears first,
 * followed by a[index], then elements greater than pivot.
 */
public class PartitionArrayWithPivot {

	public static void main(String[] args) {

		int[] arr = new int[]{0, 1, 2, 0, 2, 1, 1};

		partitionArraywithPivot2(arr, 3);
	}

	private static void partitionArraywithPivot2(int[] arr, int pivot) {
		int lastIndex = arr.length - 1;
		int pivotElement = arr[pivot];

		int smaller = 0;
		for (int i = 0; i <= lastIndex; i++) {
			if (arr[i] < pivotElement) {
				int temp = arr[smaller];
				arr[smaller] = arr[i];
				arr[i] = temp;
				smaller++;
			}
		}

		int larger = lastIndex;
		for (int i = lastIndex; i > 0 && arr[i] >= pivotElement; i--) {
			if (arr[i] > pivotElement) {
				int temp = arr[larger];
				arr[larger] = arr[i];
				arr[i] = temp;
				larger--;
			}
		}

		printElements(arr);

	}


	private static void printElements(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
}
