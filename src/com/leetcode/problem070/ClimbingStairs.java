package com.leetcode.problem070;

public class ClimbingStairs {
		
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.climbStairs(4));
	}
}

class Solution {
    
    public int climbStairs(int n) {
        if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			int x = 1, y = 2, tmp;
			for (int i = 2; i < n; i++) {
				tmp = x + y;
				x = y;
				y = tmp;
			}
			return y;
		}
    }
}
