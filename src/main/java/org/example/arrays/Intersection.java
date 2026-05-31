package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 4, 4};
        int[] arr2 = {2, 3, 4, 4, 5, 5, 7};

        System.out.println(new Intersection().returnInter(arr1, arr2));
    }

    List<Integer> returnInter(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> inter = new ArrayList<>();

        while(i < arr1.length && j< arr2.length) {
            if(arr1[i] == arr2[j]) {
                inter.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j] < arr1[i]) {
                j++;
            }
        }
        return inter;
    }
}
