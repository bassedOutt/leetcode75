package com.murmylo.volodymyr;

public class MaxProfit {
    /**
    <a href = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=level-1">Leetcode</a>
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    **/
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            int currentProfit = price - min;
            profit = Math.max(currentProfit, profit);
        }
        return profit;
    }
}
