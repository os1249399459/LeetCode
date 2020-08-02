package com.leetcode.problem088;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		Solution solution = new Solution();
		solution.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
}

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0, k = 0, count = 0;
		while (count != m + n) {
			if (j == m) {
				nums1[nums1.length - count - 1] = nums2[n - k - 1];
				k++;
				count++;
			} else if (k == n) {
				break;
			} else {
				if (nums2[n - k - 1] > nums1[m - j - 1]) {
					nums1[nums1.length - count - 1] = nums2[n - k - 1];
					k++;
					count++;
				} else if (nums2[n - k - 1] < nums1[m - j - 1]) {
					nums1[nums1.length - count - 1] = nums1[m - j - 1];
					j++;
					count++;
				} else {
					nums1[nums1.length - count - 1] = nums2[n - k - 1];
					k++;
					count++;
					nums1[nums1.length - count - 1] = nums1[m - j - 1];
					j++;
					count++;
				}
			}
		}
	}
}