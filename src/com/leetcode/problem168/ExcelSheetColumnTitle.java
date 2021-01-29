package com.leetcode.problem168;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(27));
    }
}


class Solution {

    char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'};

    public String convertToTitle(int n) {
        int div = n;
        int mod = (n - 1) % 26;
        StringBuilder title = new StringBuilder();
        while (div > 26) {
            title.append(arr[mod]);
            div = (div - 1) / 26;
            mod = (div - 1) % 26;
        }
        title.append(arr[div - 1]);
        return title.reverse().toString();
    }
}
