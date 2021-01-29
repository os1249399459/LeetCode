package com.leetcode.problem125;

public class ValidPalindrome {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}


class Solution {
    public boolean isPalindrome(String s) {
        String upper = s.toUpperCase();
        int left = 0;
        int right = upper.length() - 1;
        while (left < right) {
            if (ifNotAlphanumeric(upper.charAt(left))) {
                left++;
                continue;
            }
            if (ifNotAlphanumeric(upper.charAt(right))) {
                right--;
                continue;
            }
            if (upper.charAt(left) != upper.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean ifNotAlphanumeric(char ch) {
        return ch < '0' || ch > 'Z' || (ch > '9' && ch < 'A');
    }
}
