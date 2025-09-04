package com.practice.dsa;

import java.util.Arrays;

public class QuickSortPractice {
    private void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int median = partition(arr, low, high);
            quicksort(arr, low, median - 1);
            quicksort(arr, median + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp =  arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i+1;
    }


    public static void main(String[] args) {

        QuickSortPractice qs = new QuickSortPractice();
        int[] arr = {11,28,73,84,59,36,17,84,49,101};
        qs.quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
