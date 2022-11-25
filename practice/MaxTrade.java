package com.practice;

import java.util.List;

public class MaxTrade {
    public static long getMaxProfit(List <Integer> prices) {
        long profit = 0L;
        int maxSoFar = 0;
        for (int i = prices.size() - 1; i > -1 ; i--) {
            if (prices.get(i) >= maxSoFar) {
                maxSoFar = prices.get(i);
            }
            profit += maxSoFar - prices.get(i);
        }
        return profit;
    }

    public static void main(String[] args) {

        System.out.println(MaxTrade.getMaxProfit(List.of(7,1,5,3,6,4)));
    }
}
