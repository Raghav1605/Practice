package org.example.bs;

public class RotatedSortedArray {
    public static void main(String[] args) {
        new RotatedSortedArray().printResult();
    }

    int findNum(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;

        while(lower <= upper) {
            int mid = (lower + upper)/2;

            // if element found
            if(arr[mid] == target)
                return mid;
            // if left side of the array is sorted
            if(arr[lower] <= arr[mid]) {
                if(arr[lower] <= target && target < arr[mid]) {
                    upper = mid - 1;
                }
                else {
                    lower = mid + 1;
                }
            }

            else {
                if(target > arr[mid] && target <= arr[upper]) {
                    lower = mid + 1;
                }
                else {
                    upper = mid - 1;
                }
            }
        }
        return -1;
    }

    void printResult() {
        System.out.println(1/2);
    }
}
