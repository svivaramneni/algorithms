package com.slr.arrays;

public class ShiftedSortedArray {

	static int rIndex = -1;

	public static void main(String[] args) {
		int[] shiftArr = new int[] {9, 12, 17, 2, 4, 5};
		int num = 2;
		int index = shiftedArrSearch(shiftArr, num, 0, shiftArr.length-1);
		System.out.println("index" + index);
	}

	static int shiftedArrSearch(int[] shiftArr, int num, int i, int j) {
		System.out.println("shiftedArrSearch : i :" + i + " j : "+j);

		if(i>=j || rIndex > 0) {
			return 0;
		}


		int mid = i+j /2;
		System.out.println("mid " + mid + "shiftArr[mid] : " + shiftArr[mid]);

		if(shiftArr[mid] == num) {
			rIndex = mid;
		}else if(num >= shiftArr[mid] && num < shiftArr[j]) {
			return shiftedArrSearch(shiftArr, num, mid+1, j);
		}else if (num >= shiftArr[mid] && num > shiftArr[j]){
			return shiftedArrSearch(shiftArr, num, i, mid-1);
		}else if(num <= shiftArr[mid] && num > shiftArr[i]) {
			return shiftedArrSearch(shiftArr, num, i, mid-1);
		}else if (num <= shiftArr[mid] && num < shiftArr[i]){
			return shiftedArrSearch(shiftArr, num, mid+1, j);
		}

		return rIndex;

	}


}
