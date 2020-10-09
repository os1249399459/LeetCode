package com.leetcode.problem108;


public class SortedArrayToBinarySearchTree {

}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}