package org.example.bs;

public class ArrayRotatedTimes {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        new ArrayRotatedTimes().answer(arr);
    }

    void answer(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int lowest = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[low] <= arr[mid]) {
                if(arr[low] < lowest) {
                    index = low;
                    lowest = arr[low];
                }
                //Integer.min(lowest, arr[low]);
                low = mid + 1;
            }

            else {
                high = mid - 1;
                if(arr[mid] < lowest) {
                    index = mid;
                    lowest = arr[mid];
                }
                //Integer.min(lowest, arr[mid]);
            }
        }
        System.out.println(index);
    }
}
