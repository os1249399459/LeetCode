package com.leetcode.problem367;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.printf("result = %b", solution.isPerfectSquare(14));
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
