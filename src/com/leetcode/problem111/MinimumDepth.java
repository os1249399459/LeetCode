package com.leetcode.problem111;

public class MinimumDepth {
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
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else  {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
