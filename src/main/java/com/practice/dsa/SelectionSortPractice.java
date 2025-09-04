package com.practice.dsa;

import java.util.Arrays;

public class SelectionSortPractice {

    public void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            //swap
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        SelectionSortPractice s=new SelectionSortPractice();
        int[] arr={28,94,12,47,39,78,32,87};
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
