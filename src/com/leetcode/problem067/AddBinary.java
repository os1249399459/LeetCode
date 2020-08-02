package com.leetcode.problem067;

public class AddBinary {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.addBinary("11", "1"));
	}

}

class Solution {
	public String addBinary(String a, String b) {
		char[] charArrayA = a.toCharArray();
		char[] charArrayB = b.toCharArray();
		int length = Math.max(charArrayA.length, charArrayB.length);
		StringBuilder stringBuilder = new StringBuilder();
		int carry = 0, ai = 0, bi = 0;
		for (int i = 0; i < length; i++) {
			if (i < charArrayA.length && charArrayA[charArrayA.length - i - 1] == '1') {
				ai = 1;
			} else {
				ai = 0;
			}
			if (i < charArrayB.length && charArrayB[charArrayB.length - i - 1] == '1') {
				bi = 1;
			} else {
				bi = 0;
			}
			int ci = ai + bi + carry;
			stringBuilder.append(ci % 2);
			carry = ci / 2;
		}
		if (carry == 1) {
			stringBuilder.append(1);
		}
		return stringBuilder.reverse().toString();
	}
}
