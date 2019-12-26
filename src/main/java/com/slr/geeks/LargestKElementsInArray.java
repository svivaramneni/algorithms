package com.slr.geeks;

/**
 * Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.
 * For example, if given array is [1, 23, 12, 9, 30, 2, 50] and you are asked for the largest 3 elements
 * i.e., k = 3 then your program should print 50, 30 and 23.
 */
public class LargestKElementsInArray {

	public static void main(String[] args) {

		int[] inputArray = {1, 23, 12, 9, 30, 2, 50};

		int numberOfElementsToReturn = 3;

		sortInputArray(inputArray, numberOfElementsToReturn);

		printElements(inputArray, numberOfElementsToReturn);

	}

	private static void printElements(int[] inputArray, int numberOfElementsToReturn) {

		for (int i = 0; i < numberOfElementsToReturn; i++) {
			System.out.println(inputArray[i]);
		}
	}

	private static void sortInputArray(int[] inputArray, int numberOfElementsToReturn) {

		for (int i = 0; i < numberOfElementsToReturn; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] < inputArray[j]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;

				}
			}
		}
	}

}
