package org.example.arrays;

public class LeftRotate_Kplaces {
    public static void main(String[] args) {

    }

    int[] rotateLeft(int[] arr, int k) {

        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("needs few elements in array");

        k = k % arr.length;

        if(k == 0)
            return arr;

        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1);
        rotate(arr, 0, arr.length-1);
        return arr;
    }

    int[] rotate(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
