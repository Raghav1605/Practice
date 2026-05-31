package org.example.arrays;

public class CheckArraySorted {
    boolean returnSorted(int[] arr) {

        if(arr==null || arr.length==0)
            throw new IllegalArgumentException("Need at least 1 param");

        if(arr.length == 1)
            return true;

        for(int i=0; i< arr.length-1; i++) {
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
