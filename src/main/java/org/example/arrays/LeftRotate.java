package org.example.arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        new LeftRotate().printArray();
    }

    void printArray() {
        int[] arr = {1,2,3,4,5};
        int i = 0;

        for(int j = 1; j<arr.length; j++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
