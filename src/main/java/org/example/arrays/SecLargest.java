package org.example.arrays;

public class SecLargest {
    public static void main(String[] args) {

    }

    int returnSecLargest(int[] arr) {

        if(arr == null || arr.length==0)
            throw new IllegalArgumentException();

        int high = arr[0];
        int secHigh = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > high) {
                secHigh = high;
                high = arr[i];
            }
            else if (arr[i] > secHigh && arr[i] < high) {
                secHigh = arr[i];
            }
        }
        return secHigh;
    }
}
