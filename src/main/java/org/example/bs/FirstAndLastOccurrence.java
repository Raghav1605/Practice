package org.example.bs;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13,13};
        new FirstAndLastOccurrence().optimized(arr, 13);
    }

    void bruteForce(int[] arr, int target) {
        int first = -1;
        int last = -1;

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == target) {
                if (first == -1)
                    first = i;

                last = i;
            }
        }
        System.out.println(first + " " + last);
    }

    void optimized(int[] arr, int target) {
        int lowerBound = lowerBound(arr, target);
        if(lowerBound == arr.length || arr[lowerBound] != target) {
            System.out.println("-1 -1");
        }
        else
            System.out.println(lowerBound + " " + (upperBound(arr, target)-1));
    }

    int lowerBound(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        int ans = arr.length;

        while (upper >= lower) {
            int mid = (lower + upper)/2;

            if(arr[mid] >= target) {
                ans = mid;
                upper = mid-1;
            }
            else
                lower = mid + 1;
        }
        return ans;
    }

    int upperBound(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        int ans = arr.length;

        while (upper >= lower) {
            int mid = (lower + upper)/2;

            if(arr[mid] > target) {
                ans = mid;
                upper = mid-1;
            }
            else
                lower = mid + 1;
        }
        return ans;
    }
}
