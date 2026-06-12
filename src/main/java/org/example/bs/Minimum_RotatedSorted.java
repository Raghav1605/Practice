package org.example.bs;

public class Minimum_RotatedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        new Minimum_RotatedSorted().getMinimum(arr);
    }

    void getMinimum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int minimum = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] >= arr[low]) {
                minimum = Integer.min(minimum, arr[low]);
                low = mid+1;
            }
            else {
                minimum = Math.min(minimum, arr[mid]);
                high = mid-1;
            }
        }
        System.out.println(minimum);
    }
}
