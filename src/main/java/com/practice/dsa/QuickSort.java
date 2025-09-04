package com.practice.dsa;


import java.util.Arrays;

//choose a pivot and divide and conquer by recursively finding lower to left and greater to right side.
public class QuickSort {

    public int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int i = start-1;

        for(int j=start;j<=end-1;j++){
            if(numbers[j]<pivot){
                i++;
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
            }
        }
        int temp =numbers[end];
        numbers[end] = numbers[i+1];
        numbers[i+1] = temp;

        return i+1;
    }

    public void sort(int[] numbers, int start, int end) {
        if(start<end) {
            int median = partition(numbers, start, end);
            sort(numbers, start, median - 1);
            sort(numbers, median + 1, end);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] numbers = {10,30,90,70,40};
        qs.sort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
}
