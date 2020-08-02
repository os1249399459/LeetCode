package com.leetcode.problem009;

public class PalindromeNumber {
	
	
}

class Solution {
	
    public boolean isPalindrome(int x) {
    	if (x == 0) {
			return true;
		}
    	if (x < 0) {
			return false;
		}
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(x);
        
        return Long.parseLong(stringBuffer.reverse().toString()) == x;
    }
}