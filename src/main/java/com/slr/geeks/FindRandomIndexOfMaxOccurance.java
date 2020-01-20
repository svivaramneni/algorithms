package com.slr.geeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FindRandomIndexOfMaxOccurance {

	public static void main(String[] args) {

		// input array
		int arr[] = {-1, 4, 9, 7, 7, 2, 7, 3, 0, 9, 6, 5,
				7, 8, 9};
		int n = arr.length;
		int index = findRandomIndexOfMaxInteger(arr, n);
		System.out.println(index);

	}

	public static int findRandomIndexOfMaxInteger(int[] arr, int n) {

		//1. Create a map of integers and counts - O(n)
		Map<Integer, Integer> countsMap = new HashMap<>();
		Map<Integer, List<Integer>> indexesMap = new HashMap<>();

		int index = 0;

		for (int i : arr) {
			countsMap.put(i, countsMap.getOrDefault(i, 0) + 1);
			List<Integer> indexes = indexesMap.get(i);
			if (indexes == null) {
				indexes = new ArrayList<>();
				indexes.add(index);
				indexesMap.put(i, indexes);
			} else {
				indexes.add(index);
			}
			index++;
		}

		//2. Identify max occurance num from map - O(n)
		int maxCount = 0;
		int maxElement = arr[0];
		for (Map.Entry<Integer, Integer> entry : countsMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxElement = entry.getKey();
			}
		}

		//3. Populate array with indexes of max number.
		List<Integer> maxOccuranceNumIndexes = indexesMap.get(maxElement);

		//4. Generate random index from 0 to count and return that.
		Random r = new Random();
		int result = r.nextInt(maxOccuranceNumIndexes.size() - 1);


		return maxOccuranceNumIndexes.get(result);
	}
}
