package org.example.arrays;

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3};
        int[] fixedArray = new ZerosToEnd().moveZerosToEnd(arr);
        System.out.println(Arrays.toString(fixedArray));
    }

    int[] arrangeZeros(int[] arr) {
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array need to contain some elements");
        if(arr.length == 1)
            return arr;

        int i = 0;
        int j = 1;

        while(j < arr.length) {
            if(arr[i] != 0 && arr[j]==0) {
                i++;
                j++;
            } else if(arr[i] == 0 && arr[j] == 0) {
                j++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    int[] moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        int i = 0; // position for next non-zero

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return arr;
    }
}
