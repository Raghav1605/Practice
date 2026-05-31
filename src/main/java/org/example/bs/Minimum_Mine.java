package org.example.bs;

public class Minimum_Mine {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        new Minimum_Mine().findMinimum(arr);
    }

    void findMinimum(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int lowest = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] >= arr[low]) {
                if(arr[low] < lowest) {
                    lowest = arr[low];
                }
                low = mid + 1;
            }

            if(arr[mid] <= arr[high]) {
                if(arr[mid] < lowest) {
                    lowest = arr[mid];
                }
                high = mid - 1;
            }
        }

        System.out.println(lowest);
    }
}
