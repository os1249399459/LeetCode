package com.leetcode.problem053;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = { -1, 1, 2, 1 };
		Solution solution = new Solution();
		System.out.println(solution.maxSubArray(nums));
	}
}

class Solution {
	public int maxSubArray(int[] nums) {
		int max_so_for, max_end_here;
		max_so_for = max_end_here = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max_end_here = Math.max(nums[i], max_end_here + nums[i]);
			max_so_for = Math.max(max_so_for, max_end_here);
		}
		return max_so_for;
	}
}
