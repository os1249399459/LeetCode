package com.leetcode.problem083;

public class RemoveDuplicatesFromSortedList {

}

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode resultListNode = head;
		ListNode cursor = head;
		ListNode nexListNode = head.next;
		while (cursor != null && cursor.next != null) {
			nexListNode = cursor.next;
			if (cursor.val != nexListNode.val) {
				cursor.next = nexListNode;
				cursor = cursor.next;
				if (cursor == null) {
					break;
				}
			} else {
				nexListNode = nexListNode.next;
				cursor.next = nexListNode;
				if (cursor.next == null) {
					break;
				}
			}
		}
		return resultListNode;
	}

}
