package com.slr.algorithms;

public class InsertionSortDoublyLinkedList {

	public DNode[] sort(DNode[] doublyLinkedList) {
		int n = doublyLinkedList.length;
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int k = doublyLinkedList[i].getData();

			while(j>=0 &&  k < doublyLinkedList[j].getData()) {

				j=j-1;

			}

			DNode rightplace = doublyLinkedList[j+1];
			DNode movingNode = doublyLinkedList[i];








		}
		return doublyLinkedList;
	}
}
