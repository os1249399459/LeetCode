package com.leetcode.problem172;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trailingZeroes(5));
    }
}

class Solution {
    public int trailingZeroes(int n) {
        int ret = 0;
        while (n >= 5) {
            n /= 5;
            ret += n;
        }
        return ret;
    }
}