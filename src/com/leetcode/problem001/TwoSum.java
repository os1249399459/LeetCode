package com.leetcode.problem001;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
	
}

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (null != map.get(nums[i])) {
				return new int[] { map.get(nums[i]), i };
			} else {
				map.put(target - nums[i], i);
			}
		}
		return null;
	}
}
