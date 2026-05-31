package org.example.bs;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 3, 3, 6, 7, 7};
        int occurrences = new CountOccurrences().returnOccurrences(arr, 8);
        System.out.println(occurrences);
    }

    int returnOccurrences(int[] arr, int target) {
        int firstOccurrence = firstOccurrence(arr, target);
        if(firstOccurrence == arr.length || arr[firstOccurrence] != target)
            return -1;

        int lastOccurrence = lastOccurrence(arr, target);

        return (lastOccurrence - firstOccurrence) + 1;
    }

    int firstOccurrence(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        int ans = arr.length;

        while(upper >= lower) {
            int mid = (lower + upper)/2;

            if(arr[mid] >= target) {
                ans = mid;
                upper = mid-1;
            }
            else {
                lower = mid+1;
            }
        }
        return ans;
    }

    int lastOccurrence(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        int ans = arr.length;

        while(upper >= lower) {
            int mid = (lower + upper)/2;

            if(arr[mid] > target) {
                ans = mid;
                upper = mid-1;
            }
            else {
                lower = mid+1;
            }
        }
        return ans-1;
    }
}
