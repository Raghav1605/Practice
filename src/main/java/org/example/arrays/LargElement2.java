package org.example.arrays;

public class LargElement2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 4};
        System.out.println(new LargElement2().returnLargest(arr));
    }

    int returnLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }


        int largest = arr[0];
        for(int right = 1; right < arr.length; right++) {
            if(arr[right] > largest) {
                largest = arr[right];
            }
        }
        return largest;
    }
}
