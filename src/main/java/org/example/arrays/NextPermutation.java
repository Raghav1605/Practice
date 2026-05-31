package org.example.arrays;

public class NextPermutation {
    public static void main(String[] args) {

    }

    void findNextPermutation(int[] arr) {
        int len = arr.length;
        int breakPoint = -1;

        for(int i = len-1; i > 0; i--) {
            if(arr[i] > arr[i-1]) {
                breakPoint = i-1;
                break;
            }
        }

        if(breakPoint == -1) {
            // reverse array
        }

        for(int i = len-1; i >= breakPoint; i--) {
            if(arr[i] > arr[breakPoint]) {
                int temp = arr[i];
                arr[i] = arr[breakPoint];
                arr[breakPoint] = temp;
            }
        }

        for(int i = len-1; i > breakPoint; i--) {
            //reverse logic
        }
    }
}
