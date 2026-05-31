package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarray_SumK {
    public static void main(String[] args) {

    }

    void betterApproach(int[] arr, int target) {
        int sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(!map.containsKey(sum))
                map.put(sum, i);

            if(sum == target)
                maxLen = i + 1;

            if(map.containsKey(sum - target)) {
                maxLen = Math.max(maxLen, i - map.get(sum - target));
            }

        }
    }
}
