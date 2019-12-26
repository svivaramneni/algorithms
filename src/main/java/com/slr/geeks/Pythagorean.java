package com.slr.geeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pythagorean {

	public static void main(String[] args) {

		int[] inputArray = {3, 2, 4, 6, 5};
		Set<Integer> nums = new HashSet<>();
		int found;

		System.out.println("Processing array");



		Arrays.sort(inputArray);
		//Arrays.binarySearch()

		for (int i = inputArray.length-1; i >0 ; i--) {
			for (int j = i-1; j > 1; j--) {
				int temp = inputArray[i]*inputArray[i] - inputArray[j]*inputArray[j];
				int temp2 =(int) Math.sqrt(temp);
				if(nums.add(temp2)) {
					found = Arrays.binarySearch(Arrays.copyOfRange(inputArray, 0, j-1), temp);

					if(found >= 0) {
						System.out.println(""+inputArray[i] + ", "+inputArray[j] +", "+ inputArray[found]);
					}
				}

			}




		}



	}
}
