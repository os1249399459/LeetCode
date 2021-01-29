package com.leetcode.problem136;

public class SingleNumber {
}

class Solution {
    public int singleNumber(int[] nums) {
        int b = nums[0];
        for (int i = 1; i < nums.length; i++) {
            b = b ^ nums[i];
        }
        return b;
    }
}
