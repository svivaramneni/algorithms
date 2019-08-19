package com.slr.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

	public static void main(String[] args) {

		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);

		System.out.println(reverseList(root));
		System.out.println(reverseListRecursion(root));

	}

	public static ListNode reverseList(ListNode head) {

		Stack<ListNode> listNodeStack = new Stack<>();
		while (head != null) {
			listNodeStack.push(head);
			head = head.next;
		}

		ListNode dummy = new ListNode(-1);
		head = dummy;

		while (!listNodeStack.empty()) {
			head.next = new ListNode(listNodeStack.pop().data);
			head = head.next;
		}

		return dummy.next;
	}

	public static ListNode reverseListRecursion(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode p = reverseListRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return p;
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
