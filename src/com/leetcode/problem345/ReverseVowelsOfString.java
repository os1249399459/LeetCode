package com.leetcode.problem345;

import java.util.Arrays;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s = "Aa";
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels(s));
    }
}

class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int left = 0;
        int right = charArray.length - 1;
        while(left < right){
            char cLeft = charArray[left];
            System.out.printf("cLeft = %c\n", cLeft);
            int searchLeft = Arrays.binarySearch(vowels, cLeft);
            System.out.printf("searchLeft = %d\n", searchLeft);
            if(searchLeft < 0){
                left++;
                continue;
            }
            char cRight = charArray[right];
            System.out.printf("cRight = %c\n", cRight);
            int searchRight = Arrays.binarySearch(vowels, cRight);
            System.out.printf("searchRight = %d\n", searchRight);
            if(searchRight < 0){
                right--;
                continue;
            }
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(charArray);
    }
}
