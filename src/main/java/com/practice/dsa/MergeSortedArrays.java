package com.practice.dsa;

import java.util.Arrays;

public class MergeSortedArrays {

    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedarr  = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedarr [k] = arr1[i];
                i++;
            }else{
                mergedarr [k] = arr2[j];
                j++;
            }
            k++;
        }
        if(k != arr1.length+arr2.length){
            if(!(i == arr1.length)){
                while(i<arr1.length){
                    mergedarr [k] = arr1[i];
                    i++;
                    k++;
                }
            }
            if(!(j == arr2.length)){
                while(j<arr2.length){
                    mergedarr [k] = arr2[j];
                    j++;
                    k++;
                }
            }
        }
        return mergedarr;
    }

    public static void main(String args[])
    {
        MergeSortedArrays m = new MergeSortedArrays();
        int[] result = m.mergeSortedArrays(new int[] {2,7,8,23},new int[] {1,3,4,5,6});
        System.out.println(Arrays.toString(result));
    }
}
