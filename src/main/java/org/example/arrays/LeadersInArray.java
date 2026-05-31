package org.example.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        new LeadersInArray().findLeaders(arr);
    }

    void findLeaders(int[] arr) {
        int n = arr.length;
        int largest = arr[n-1];
        List<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);

        for(int i = n-2; i>0; i--) {
            if(arr[i] > largest) {
                largest = arr[i];
                list.add(largest);
            }
        }
        Collections.sort(list);
        for(Integer key: list) {
            System.out.println("leaders in a map: " + key);
        }
    }
}
