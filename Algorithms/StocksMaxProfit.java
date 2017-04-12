package com.practice.algos;

public class StocksMaxProfit {
	public static int maxProfit(int[] prices) {
		int total = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i])
				total += prices[i + 1] - prices[i];
		}

		return total;
	}

	public static void main(String args[]) {
		int[] nums = {
				11,19,16,22,10,20};
		int x = maxProfit(nums);
		System.out.println(x + "");
	}
}
