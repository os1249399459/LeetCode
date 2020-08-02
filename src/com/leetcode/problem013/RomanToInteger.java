package com.leetcode.problem013;

public class RomanToInteger {

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.romanToInt("LVIII");
	}

};

class Solution {

	public int romanToInt(String s) {
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		int[] temp = new int[length];
		int max = 1;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			temp[length - i - 1] = getValue(charArray[length - i - 1]);
            max = Math.max(temp[length - i - 1], max);
			if (temp[length - i - 1] < max) {
				sum -= temp[length - i - 1];
			} else {
				sum += temp[length - i - 1];
			}
		}
		return sum;
	}
	
	public int getValue(char ch) {
		int ret = 0;
		switch (ch) {
		case 'I':
			ret = 1;
			break;
		case 'V':
			ret = 5;
			break;
		case 'X':
			ret = 10;
			break;
		case 'L':
			ret = 50;
			break;
		case 'C':
			ret = 100;
			break;
		case 'D':
			ret = 500;
			break;
		case 'M':
			ret = 1000;
			break;

		default:
			break;
		}
		
		return ret;
	}
}