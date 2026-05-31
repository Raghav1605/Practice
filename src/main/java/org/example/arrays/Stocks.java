package org.example.arrays;

public class Stocks {
    public static void main(String[] args) {

    }

    void calculateProfit(int[] arr) {
        int minimum = arr[0];
        int profit = 0;

        for(int i = 1; i<arr.length; i++) {
            int cost = arr[i] - minimum;
            profit = Integer.max(cost, profit);
            minimum = Integer.min(minimum, arr[i]);
        }

        System.out.println(profit);
    }
}
