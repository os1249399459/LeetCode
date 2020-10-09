package com.leetcode.problem107;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversal2 {

}

class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> resultList = new ArrayList<>();
		if (root == null) {
			return resultList;
		}
		Stack<List<Integer>> stack = new Stack<>();
		List<TreeNode> list = new ArrayList<>();
		list.add(root);
		for (;;) {
			if (list.size() == 0) {
				break;
			}
			List<Integer> list2 = new ArrayList<>();
			List<TreeNode> list3 = new ArrayList<>();
			for (TreeNode tNode : list) {
				if (tNode != null) {
					list2.add(tNode.val);
					if (tNode.left != null) {
						list3.add(tNode.left);
					}
					if (tNode.right != null) {
						list3.add(tNode.right);
					}
				}
			}
			stack.add(list2);
			list.clear();
			list.addAll(list3);
		}
		while (!stack.isEmpty()) {
			resultList.add(stack.pop());
		}
		return resultList;

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
