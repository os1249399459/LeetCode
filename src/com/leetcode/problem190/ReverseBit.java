package com.leetcode.problem190;

public class ReverseBit {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int rvs = solution.reverseBits(0b00000010100101000001111010011100);
        printByBit(rvs);
    }

    private static void printByBit(long n) {
        for (int i = 0; i < 32; i++) {
            if ((n & 0b1) == 0b1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            n = n >> 1;
        }
        System.out.print("\n");
    }
}

class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rvs = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 0b1) == 0b1) {
                rvs += 1;
            }
            n = n >> 1;
            if (i < 31) {
                rvs = rvs << 1;
            }
        }
        return rvs;
    }
}