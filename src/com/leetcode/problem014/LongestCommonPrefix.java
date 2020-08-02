package com.leetcode.problem014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		Solution solution = new Solution();
		solution.longestCommonPrefix(strs);
	}

	static class Solution {
		public String longestCommonPrefix(String[] strs) {
			String retString = "";
			int length = strs.length;
			HashMap<String, Integer> hashMap = new HashMap<>();
			int minStrLength = Integer.MAX_VALUE;
			for (int i = 0; i < length; i++) {
				int strLength = strs[i].length();
				minStrLength = Math.min(minStrLength, strLength);
				for (int j = 0; j < minStrLength; j++) {
					String keyString = strs[i].substring(0, j + 1);
					System.out.println(String.format("keyString = %s", keyString)); 
					if (hashMap.get(keyString) != null) {
						hashMap.put(keyString, hashMap.get(keyString) + 1);
					} else {
						hashMap.put(keyString, 1);
					}
				}
			}
			Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
			Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, Integer> entry = iterator.next();
				System.out.println(String.format("entry.getValue() = %d, entry.getKey() = %s", entry.getValue(), entry.getKey()));
				if (entry.getValue() == length && entry.getKey().length() > retString.length()) {
					retString = entry.getKey();
				}

			}
			System.out.println(retString);
			return retString;
		}
	}
}
