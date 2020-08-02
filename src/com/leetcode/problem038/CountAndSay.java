package com.leetcode.problem038;

public class CountAndSay {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.countAndSay(12));
	}

}

class Solution {
	public String countAndSay(int n) {
		return countAndSay(n, "1");
	}

	public String countAndSay(int n, String say) {
		if (n == 1) {
			return say;
		} else {
			char[] charArray = say.toCharArray();
			char digit = '0';
			int count = 0;
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == digit) {
					count++;
				} else {
					if (digit != '0') {
						stringBuilder.append(count).append(digit);
					}
					digit = charArray[i];
					count = 1;
				}
			}
			stringBuilder.append(count).append(digit);
			return countAndSay(n - 1, stringBuilder.toString());

		}
	}
}
