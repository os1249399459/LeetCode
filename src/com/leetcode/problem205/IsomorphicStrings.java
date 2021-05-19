package com.leetcode.problem205;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < sArray.length; i++) {
            if (hashMap.containsKey(sArray[i])) {
                if (hashMap.get(sArray[i]) != tArray[i]) {
                    return false;
                }
            } else if (hashMap.containsValue(tArray[i])) {
                return false;
            } else {
                hashMap.put(sArray[i], tArray[i]);
            }
        }
        return false;
    }
}
