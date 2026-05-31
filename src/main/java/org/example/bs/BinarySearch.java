package org.example.bs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 8, 10, 11};
        int target = 6;

        int result = binarySearch(nums, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length;

        while(j > i) {
            int mid = (i + j)/2;
            if (arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                j = mid-1;
            else
                i = mid+1;
        }
        return -1;
    }
}
