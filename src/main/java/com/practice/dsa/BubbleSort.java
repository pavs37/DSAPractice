package com.practice.dsa;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] numbers) {
        boolean swap = false;
        int size = numbers.length;
        for (int i = 0; i < size-1; i++) {
            for (int j =0; j < size-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] result = bs.sort(new int[] {101,21,139,81,59,46,23,97});
        System.out.println(Arrays.toString(result));
    }
}
