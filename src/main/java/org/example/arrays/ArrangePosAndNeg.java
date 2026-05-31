package org.example.arrays;

import java.util.Arrays;

public class ArrangePosAndNeg {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        new ArrangePosAndNeg().arrangeNumbers(arr);
    }

    void arrangeNumbers(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;

        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                ans[pos] = arr[i];
                pos = pos + 2;
            }
            else {
                ans[neg] = arr[i];
                neg = neg + 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
