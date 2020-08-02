package com.leetcode.problem021;

public class MergeTwoSortedLists {

}

class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = null;
		return mergeTwoLists(l1, l2, l3);
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2, ListNode l3){
		if (l1 == null && l2 == null) {
			ListNode l4 = null;
			while (l3 != null) {
				ListNode l5 = l4;
				l4 = new ListNode(l3.val);
				l4.next = l5;
				l3 = l3.next;
			}
			return l4;
		} else {
			ListNode l4 = l3;
			if (l1 == null) {
				l3 = new ListNode(l2.val);
				l3.next = l4;
				l2 = l2.next;
				return mergeTwoLists(l1, l2, l3);
			} else if (l2 == null){
				l3 = new ListNode(l1.val);
				l3.next = l4;
				l1 = l1.next;
				return mergeTwoLists(l1, l2, l3);
			} else if (l2.val < l1.val) {
				l3 = new ListNode(l2.val);
				l3.next = l4;
				l2 = l2.next;
				return mergeTwoLists(l1, l2, l3);
			} else {
				l3 = new ListNode(l1.val);
				l3.next = l4;
				l1 = l1.next;
				return mergeTwoLists(l1, l2, l3);
			}
		}
	}
}

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
