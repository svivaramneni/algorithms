package com.slr.arrays;

public class ProductArrayExceptCurrent {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4};

		int[] result = productExceptSelf(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}


	}

	public static int[] productExceptSelf(int[] nums) {

		int[] leftArray = new int[nums.length];

		int product = 1;
		leftArray[0] = product;

		for (int i = 1; i < nums.length; i++) {
			leftArray[i] = product;
			product *= leftArray[i];
		}

		int rightProduct = 1;
		int[] rightArray = leftArray;

		for (int i = leftArray.length-1; i >= 0; i--) {
			rightArray[i] = rightArray[i] * rightProduct;
			rightProduct = rightProduct * nums[i];
		}


		return rightArray;
	}

}
