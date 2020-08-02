package com.leetcode.problem069;

public class Sqrt {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.mySqrt(9));
	}
}

class Solution {

	public int mySqrt(int x) {
		int odd = 1;
		int k = 0;
		while (x >= odd) {
			x -= odd;
			odd = odd + 2;
			k++;
		}
		return k;
	}
}
