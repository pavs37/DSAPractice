package com.practice.dsa;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }
            //swap the min index items;
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {91,78,32,67,29,58,39};
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
