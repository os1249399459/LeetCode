package com.leetcode.problem101;

public class SymmetricTree {

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
    public boolean isSymmetric(TreeNode root) {
    	if(root == null) {
    		return true;
    	}
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode p, TreeNode q) {
    	if (p == null) {
			return  q == null;
		} else if (p.left == null && p.right == null) {
			return q != null && p.val == q.val && q.left == null && q.right == null;
		} else if (p.left != null && p.right == null) {
			return q != null && p.val == q.val && q.right != null && q.left == null && isMirror(p.left, q.right);
		} else if (p.left == null && p.right != null) {
			return q != null && p.val == q.val && q.right == null && q.left != null && isMirror(p.right, q.left);
		} else {
			return q != null && p.val == q.val && q.left != null && q.right != null && isMirror(p.left, q.right)
					&& isMirror(p.right, q.left);
		}
    }
}

