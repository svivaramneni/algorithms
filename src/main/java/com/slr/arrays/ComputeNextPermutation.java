package com.slr.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a program that takes a input permutation,
 * and returns next permutation under dictionary ordering.
 */
public class ComputeNextPermutation {
	public static void main(String[] args) {

		List<Integer> perm = new ArrayList<>();
		perm.add(1);
		perm.add(0);
		perm.add(3);
		perm.add(2);

		System.out.println(nextPermutation(perm)); //1203

	}

	private static List<Integer> nextPermutation(List<Integer> perm) {

		int k = perm.size() - 2;
		while(k > 0 && perm.get(k) >= perm.get(k+1)) {
			--k; //index of "0" in this case
		}

		if(k == -1) {
			return Collections.emptyList();
		}

		//Swap the smallest entry after index k that is greater than perm[k]. //1230

		for (int i = perm.size() -1; i > k ; i--) {
			if(perm.get(i) > perm.get(k)) {
				Collections.swap(perm, k, i);
				break;
			}
		}

		//Since perm.subList[k+1, perm.size()) is in decreasing order,
		// we have to reverse it to get the smallest dictionary ordering //1203
		Collections.reverse(perm.subList (k + 1, perm .size ())) ;
		return perm;
	}
}
