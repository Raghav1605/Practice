package org.example.bs;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int index = new LowerBound().findLowerBound(arr, 20);
        System.out.println(index);
    }

    int findLowerBound(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length-1;

        while(lower < upper) {
            int mid = (lower + upper)/2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                upper = mid-1;
            else
                lower = mid + 1;
        }
        return lower;
    }
}
