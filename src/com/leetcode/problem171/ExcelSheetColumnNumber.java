package com.leetcode.problem171;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("ZY"));
    }
}


class Solution {

    public int titleToNumber(String s) {
        char[] titleArr = s.toCharArray();
        int number = 0;
        for (int i = 0; i < titleArr.length; i++) {
            number = (titleArr[i] - 'A' + 1) + number * 26;
        }
        return number;
    }

}
