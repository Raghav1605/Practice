package org.example.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        new SecondLargestElement().findSecLargest();
    }

    void findSecLargest() {
        int[] arr = {5, 2, 9, 4, 11, 8};

        int largest = arr[0];
        int secondLargest = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
