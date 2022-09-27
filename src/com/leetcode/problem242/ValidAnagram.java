package com.leetcode.problem242;

import java.util.Arrays;

public class ValidAnagram {

}

class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) {
            return false;
        }
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}
