package com.leetcode.problem028;

public class Strstr {
	
}

class Solution {
    public int strStr(String haystack, String needle) {
    	if (needle.equals("")) {
			return 0;
		}
        int hLength = haystack.length();
        int nLength = needle.length();
        for (int i = 0; i < hLength - nLength + 1; i++) {
			String subString = haystack.substring(i);
			if (subString.startsWith(needle)) {
				return i;
			}
		}
        return -1;
    }
}
