package com.slr.arrays;

public class DeleteDuplicates {

	public static void main(String[] args) {

		int[] a = new int[]{2, 3, 5, 5, 7, 11, 11, 11, 13};

		int newCounter = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] != a[i]) {
				a[newCounter] = a[i - 1];
				newCounter++;
				if (i == a.length - 1) {
					a[newCounter] = a[i];
				}
			}
		}
		printElements(a);
	}

	private static void printElements(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
}
