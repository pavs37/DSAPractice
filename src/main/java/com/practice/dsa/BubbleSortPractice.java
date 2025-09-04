package com.practice.dsa;

import java.util.Arrays;

public class BubbleSortPractice {

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swap = false;
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortPractice bs = new BubbleSortPractice();
        int[] arr = {12,65,34,78,5,29,98};
        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
