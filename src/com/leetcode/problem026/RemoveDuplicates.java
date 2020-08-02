package com.leetcode.problem026;

public class RemoveDuplicates {
	
	

}

class Solution {
    public int removeDuplicates(int[] nums) {
    	int length = nums.length;
    	if (length < 2) {
			return length;
		}
    	int curNum = nums[0];
    	int x = 1;
        for (int i = 0; i < length; i++) {
			if (curNum != nums[i]) {
				x++;
				curNum = nums[i];
				nums[x - 1] = curNum;
			}
		}
        return x;
    }
}
