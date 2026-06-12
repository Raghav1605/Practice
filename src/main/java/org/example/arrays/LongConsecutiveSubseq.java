package org.example.arrays;

import java.util.Arrays;

public class LongConsecutiveSubseq {
    public static void main(String[] args) {

    }

    void calcSubSequence(int[] arr) {
        // sort the array
        Arrays.sort(arr);

        int cntCurr = 0;
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;

        for(int i=0; i < arr.length; i++) {
            if(lastSmaller == arr[i]-1) {
                lastSmaller = arr[i];
                cntCurr++;
            }

            else if(lastSmaller != arr[i]) {
                cntCurr = 1;
                lastSmaller = arr[i];
            }

            longest = Math.max(longest, cntCurr);
        }

    }
}
