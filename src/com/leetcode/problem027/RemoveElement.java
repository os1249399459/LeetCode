package com.leetcode.problem027;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		Solution solution = new Solution();
		int length = solution.removeElement(nums, 2);
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}
	}

}

class Solution {

	public int removeElement(int[] nums, int val) {
		int count = 0, i;
		for (i = 0; i < nums.length; i++) {
			if (nums[count] != val) {
				nums[i] = nums[count];
			} else {
				i--;
			}
			count++;
			if (count == nums.length) {
				break;
			}
		}
		return i + 1;
	}
}