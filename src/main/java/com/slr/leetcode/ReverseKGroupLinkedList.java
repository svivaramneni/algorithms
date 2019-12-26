package com.slr.leetcode;

public class ReverseKGroupLinkedList {
	public static void main(String[] args) {

		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		//root.next.next.next.next.next = new ListNode(6);
		//root.next.next.next.next.next.next = new ListNode(7);

		//reverseKList(root, 3);
		reverseKGroup2(root, 2);

	}

	private static ListNode reverseKList(ListNode head, int k) {

		if (head == null) {
			return null;
		}

		ListNode current = head, prev = null, next;
		int nodeCount = 0;

		while (current != null) {
			current = current.next;
			nodeCount++;
		}

		int nodesToSkip = nodeCount % k;
		current = head;

		for (int i = 0; i < nodeCount - nodesToSkip; i++) {
			ListNode startNodeForGroup = current;

			for (int j = 0; j < k; j++) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}

			startNodeForGroup.next = prev;

		}

		printList(prev);


		return current;
	}


	static ListNode reverseKGroup2(ListNode head, int k) {
		ListNode it = head;
		int count = 0;
		while (it!=null) {
			++count;
			if (count == k) {
				break;
			}
			it = it.next;
		}
		if (count < k)
			return head;

		ListNode post = reverseKGroup2(it.next, k);

		ListNode prev = null, cur = head, next = null;
		for (int i = 0; i < k; ++i) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}

		head.next = post;
		printList(prev);

		return prev;
	}

	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}


	public static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode{" +
					"data=" + data +
					'}';
		}
	}
}
