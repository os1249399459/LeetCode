package com.leetcode.problem204;

public class CountPrimes {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPrimes(100));
    }
}

class Solution {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        int[] nArray = new int[n];
        nArray[0] = -1;
        nArray[1] = -1;
        int curSei;
        for (int i = 2; i < n; i++) {
            if (nArray[i] != -1) {
                curSei = i;
                System.out.printf("curSei = %d\n", curSei);
                if (curSei * curSei > n) {
                    break;
                }
                for (int j = 2; j < n; j++) {
                    int ola = j * curSei;
                    if (ola < n) {
                        nArray[ola] = -1;
                    } else {
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (nArray[i] != -1) {
                count++;
                System.out.printf("i = %d\n", i);
            }
        }
        return count;
    }
}