package com.slr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
	public static void main(String[] args) {
		int[] a = {1, 1, 2};
		int[] b = {1, 2, 3};
		List<int[]> result = kSmallestPairs(a, b, 10);

		//System.out.println(Arrays.toString(result.toArray()));

		for(int[] x: result) {
			System.out.println(x[0] + ", " + x[1]);
		}

		System.out.println("output" + 9%15);

	}


	public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		// min queue, sorted by pair sum
		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
		List<int[]> res = new ArrayList();
		int N1 = nums1.length, N2 = nums2.length;
		if (N1 == 0 || N2 == 0) return res; // no pairs to form, just return an empty res list
		// offer initial pairs {num1, num2, index_of_num2}
		for (int i = 0; i < Math.min(N1, k); i++) q.offer(new int[]{nums1[i], nums2[0], 0});
		// get 1st k elem into result, each time, offer potential better pairs into queue
		// if there r not enough pair, just return all pairs
		for (int i = 0; i < Math.min(N1 * N2, k); i++) {
			// get the best pair and put into res
			int[] cur = q.poll();
			res.add(new int[]{cur[0], cur[1]});
			// next better pair could with be A: {after(num1), num2} or B: {num1. after(num2)}
			// for A, we've already added top possible k into queue, so A is either in the queue already, or not qualified
			// for B, it might be a better choice, so we offer it into queue
			if (cur[2] < N2 - 1) { // still at least one elem after num2 in array nums2
				int idx = cur[2] + 1;
				q.offer(new int[]{cur[0], nums2[idx], idx});
			}
		}
		return res;
	}
}