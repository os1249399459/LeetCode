package com.leetcode.problem058;

public class LengthOfLastWord {

}

class Solution {
    public int lengthOfLastWord(String s) {
    	if(s.trim().length() == 0){
            return 0;
        }
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
