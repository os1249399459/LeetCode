package com.leetcode.problem167;

import java.util.Arrays;
import java.util.Locale;

public class TwoSumII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 4, 9, 56, 90};
        System.out.println(Arrays.toString(solution.twoSum(numbers, 8)));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int[] rem = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rem[i] = target - numbers[i];
        }
        for (int j = 0; j < numbers.length; j++) {
            int p = binarySearch(numbers, rem[j]);
            if (p > -1 && j != p) {
                if (j < p) {
                    ret = new int[]{j + 1, p + 1};
                } else {
                    ret = new int[]{p + 1, j + 1};
                }
                return ret;
            }
        }
        return ret;
    }

    private int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = numbers[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}
