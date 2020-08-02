package com.leetcode.problem100;

public class SameTree {

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

class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null) {
			return  q == null;
		} else if (p.left == null && p.right == null) {
			return q != null && p.val == q.val && q.left == null && q.right == null;
		} else if (p.left != null && p.right == null) {
			return q != null && p.val == q.val && q.left != null && q.right == null && isSameTree(p.left, q.left);
		} else if (p.left == null && p.right != null) {
			return q != null && p.val == q.val && q.left == null && q.right != null && isSameTree(p.right, q.right);
		} else {
			return q != null && p.val == q.val && q.left != null && q.right != null && isSameTree(p.left, q.left)
					&& isSameTree(p.right, q.right);
		}
	}
}