package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 4, 4};
        int[] arr2 = {2, 3, 5, 5, 7};

        System.out.println(new Union().returnUnion(arr1, arr2));
    }

    List<Integer> returnUnion(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();

        while(i < arr1.length && j< arr2.length) {
            if(arr1[i] <= arr2[j]) {
                if(!union.contains(arr1[i]))
                    union.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]) {
                if(!union.contains(arr2[j]))
                    union.add(arr2[j]);
                j++;
            }
        }

        while(i < arr1.length) {
            if(!union.contains(arr1[i]))
                union.add(arr1[i]);
            i++;
        }

        while(j < arr2.length) {
            if(!union.contains(arr2[j]))
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
}
