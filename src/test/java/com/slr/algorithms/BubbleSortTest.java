package com.slr.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

	private BubbleSort sorter;

	@Before
	public void setUp() {
		sorter=new BubbleSort();
	}

	@Test
	public void simpleBSTest() {
		int[] inputArr = {10,2,8,6,7,3};
		int[] expectedOrder = { 2,3,6,7,8,10};
		int[] arr2 = sorter.sortElements(inputArr);

		assertArrayEquals(expectedOrder, arr2);

		for(int a : arr2) {
			System.out.println(a);
		}
	}
}
