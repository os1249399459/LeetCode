package com.leetcode.problem020;

import java.util.Stack;

public class ValidParentheses {
	
}


class Solution {
	public boolean isValid(String s) {
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < length; i++) {
			switch (charArray[i]) {
			case '(':
			case '[':
			case '{': {
				stack.push(charArray[i]);
			}
				break;
			case ')': {
				if (stack.size() == 0) {
					return false;
				} else if (stack.pop() != '(') {
					return false;
				} else {
					continue;
				}
			}
			case ']': {
				if (stack.size() == 0) {
					return false;
				} else if (stack.pop() != '[') {
					return false;
				} else {
					continue;
				}
			}
			case '}': {
				if (stack.size() == 0) {
					return false;
				} else if (stack.pop() != '{') {
					return false;
				} else {
					continue;
				}
			}
			default:
				break;
			}
		}
		return stack.size() == 0;
	}
}