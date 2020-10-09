package com.leetcode.problem104;

public class DepthOfBinaryTree {

}

class Solution {
	public int maxDepth(TreeNode root) {
		if (root != null) {
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		} else {
			return 0;
		}
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
