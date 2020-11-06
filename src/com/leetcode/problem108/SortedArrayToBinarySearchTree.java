package com.leetcode.problem108;


public class SortedArrayToBinarySearchTree {

}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArrayToBST(nums, left, mid - 1);
        treeNode.right = sortedArrayToBST(nums, mid + 1, right);
        return treeNode;
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
