package com.leetcode.problem231;

public class PowerOfTwo {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        String str = Integer.toBinaryString(n);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
}
