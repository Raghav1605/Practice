package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    boolean twoSumReturn(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
           map.put(arr[i], i);

           if(map.containsKey(target - arr[i])) {
               return true;
           }
        }
        return false;
    }
}
