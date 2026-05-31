package org.example.arrays;

public class KadaneAlgo {
    public static void main(String[] args) {

    }

    int maxSubarraySum(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;
        int arrStart = -1, arrEnd = -1;
        int start = 0;
        for(int i = 0; i < arr.length; i++) {
            if(sum == 0)
                start = i;

            sum += arr[i];

            if(sum > max) {
                max = sum;
                arrStart = start;
                arrEnd = i;
            }

            if(sum < 0)
                sum = 0;
        }
    return max;
    }
}
