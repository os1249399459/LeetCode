package com.leetcode.problem007;

public class ReverseInteger {
	
}

class Solution {
	public int reverse(int x) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(Math.abs(x));
		String string = stringBuilder.reverse().toString();
		if (!string.matches("\\d+")) {
			return 0;
		}
		Long l = Long.parseLong(string);
		if (l > Integer.MAX_VALUE) {
			return 0;
		}

		if (x < 0) {
			return -l.intValue();
		} else {
			return l.intValue();
		}
	}
}
