package com.leetcode.problem228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        Solution solution = new Solution();
        System.out.print(Arrays.toString(solution.summaryRanges(nums).toArray()));
    }
}


class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        int rangeStartPos = 0;
        for (int i = 0; i + 1 < nums.length; i++) {
            System.out.printf("nums[%d] = %d , nums[%d] = %d \n", i, nums[i], (i + 1), nums[i + 1]);
            System.out.printf("rangeStartPos = %d \n", rangeStartPos);
            if (i + 2 == nums.length || nums[i] + 1 != nums[i + 1]) {
                if (rangeStartPos == i) {
                    ans.add(String.valueOf(nums[i]));
                } else {
                    ans.add(String.format("%d->%d", nums[rangeStartPos], nums[i]));
                }
                rangeStartPos = i + 1;
            }
        }
        return ans;
    }
}