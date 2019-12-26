package com.slr.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Computes the maximum profit that can be made by buying and selling a share at most twice.
 * The second buy must be made on another date after the first sale.
 */
public class BuyAndSellStockTwice {

	public static void main(String[] args) {
		int[] prices = new int[]{12, 11, 13, 9, 12, 8, 14, 13, 15};

		System.out.println(buyAndSellStockTwice(prices));
	}

	private static double buyAndSellStockTwice(int[] prices) {
		double maxTotalProfit = 0;
		List<Double> firstBuySellProfits = new ArrayList<>();
		double minPriceSoFar = Double.MAX_VALUE;

		//Forward phase. For each day we record maximum profit if we sell on that day.
		for (int price : prices) {
			minPriceSoFar = Math.min(minPriceSoFar, price);
			firstBuySellProfits.add(Math.max(maxTotalProfit, price - minPriceSoFar));
		}

		//Backward phase. For each day, find the maximum profil if we make the second buy on that day
		double maxPriceSoFar = Double.MIN_VALUE;

		for (int i = prices.length - 1; i > 0 ; i--) {
			maxPriceSoFar = Math.max(maxPriceSoFar, prices[i]);
			maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar- prices[i] + firstBuySellProfits.get(i-1));
		}

		return maxTotalProfit;
	}
}
