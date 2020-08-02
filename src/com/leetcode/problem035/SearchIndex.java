package com.leetcode.problem035;

public class SearchIndex {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(solution.searchInsert(nums, 2));
	}

}

class Solution {
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		if (target < nums[low]) {
			return low;
		}
		if (target > nums[high]) {
			return high + 1;
		}
		int mid = 0;
		int midVal = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			System.out.println(String.format("low = %d, high = %d, mid = %d", low, high, mid));
			midVal = nums[mid];

			if (midVal < target)
				low = mid + 1;
			else if (midVal > target)
				high = mid - 1;
			else
				return mid; // key found
		}
		if (midVal < target) {
			return mid + 1;
		} else {
			return mid - 1;
		}
	}
}
