package org.example.arrays;

public class LargestElement {
    public static void main(String[] args) {
        System.out.println(new LargestElement().largestNum());
    }

    int largestNum() {
        int[] arr = {3,3,0,99,-40};
        int largest = arr[0];

        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
