package com.codecool.bubblesort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] myList = {5,3,1,12,9};
        bubblesort(myList);
    }

    private static void bubblesort(int[] toSort){
        if(toSort == null) {
            throw new IllegalArgumentException("The list is empty.");
        }
        System.out.println("Your list was: " + Arrays.toString(toSort));

        int listLength = toSort.length;

        boolean sorted = false;
        while(!sorted) {

            boolean unsorted = false;

            for (int i = 0; i < listLength-1; i++) {
                int index1 = toSort[i];
                int index2 = toSort[i+1];

                if(index1 > index2) {
                    System.out.println("Swapping " + index1 + " with " + index2);
                    toSort[i] = index2;
                    toSort[i+1] = index1;
                    unsorted = true;
                }
            }
            if(!unsorted)
                sorted = true;
        }

        System.out.println("The list, sorted with bubble sort is: " + Arrays.toString(toSort));
    }
}
