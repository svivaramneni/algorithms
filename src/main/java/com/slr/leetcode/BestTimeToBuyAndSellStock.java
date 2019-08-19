package com.slr.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {7, 6, 4, 3, 1};
		int[] prices2 = {7, 1, 5, 3, 6, 4};
		int[] prices3 = {1, 2, 3, 4, 5};

		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(prices2));
		System.out.println(maxProfit(prices3));
	}


	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i]) {
				profit += prices[i + 1] - prices[i];
			}
		}
		return profit;

	}
}
