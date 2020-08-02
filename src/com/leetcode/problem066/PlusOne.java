package com.leetcode.problem066;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 8, 9, 9 };
		Solution solution = new Solution();
		int[] result = solution.plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

class Solution {

	public int[] plusOne(int[] digits) {
		int carry = 0;
		int d;
		int length = digits.length;
		for (int i = 0; i < length; i++) {
			if (i == 0) {
				d = digits[length - i - 1] + 1;
			} else {
				d = digits[length - i - 1] + carry;
			}
			System.out.println(String.format("digits[%d] = %d, d = %d", length - i - 1, digits[length - i - 1], d));
			if (d == 10) {
				digits[length - i - 1] = 0;
				carry = 1;
			} else {
				digits[length - i - 1] = d;
				carry = 0;
			}
			if (carry == 0) {
				return digits;
			}
		}
		digits = new int[length + 1];
		digits[0] = 1;
		return digits;
	}
}
