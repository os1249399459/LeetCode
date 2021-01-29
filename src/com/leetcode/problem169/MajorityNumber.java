package com.leetcode.problem169;

public class MajorityNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0) {
                major = nums[i];
            }
            if (nums[i] == major) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return major;
    }
}