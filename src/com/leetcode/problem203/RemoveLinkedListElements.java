package com.leetcode.problem203;

public class RemoveLinkedListElements {

    public static void main(String[] args) {

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

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode zero = new ListNode();
        zero.next = head;
        ListNode target = zero;
        while (target.next != null) {
            if (target.next.val == val) {
                head = target.next;
                target.next = head.next;
            } else {
                target = target.next;
            }
        }
        return zero.next;
    }
}