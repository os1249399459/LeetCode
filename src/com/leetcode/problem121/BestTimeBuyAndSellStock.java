package com.leetcode.problem121;

public class BestTimeBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(nums));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int mini_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < mini_price) {
                mini_price = prices[i];
            } else if (prices[i] - mini_price > max_profit) {
                max_profit = prices[i] - mini_price;
            }
        }
        return max_profit;
    }
}

