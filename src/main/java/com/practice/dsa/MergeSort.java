package com.practice.dsa;

import java.util.Arrays;

public class MergeSort {


    public static void main(String args[]){
       MergeSort m = new MergeSort();
        int[] numbers ={12,43,65,17,34,78,54};
        m.mergesort(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    private void mergesort(int[] numbers, int min, int max) {
        if (min < max) {
            int mid = min + (max - min) / 2;
            mergesort(numbers, min, mid);
            mergesort(numbers, mid + 1, max);
            merge(numbers, min, mid, max);
        }
    }
        private void merge(int[] numbers, int min, int mid, int max){
            int l1 = mid-min+1;
            int l2 = max-mid;
            int[] temp = new int[l1];
            int[] temp2 = new int[l2];
            System.arraycopy(numbers,min,temp,0,l1);
            System.arraycopy(numbers,mid+1,temp2,0,l2);

            int i=0;
            int j=0;
            int k = min;
            while(i<l1&&j<l2){
                if(temp[i]<temp2[j]){
                    numbers[k] =  temp[i];
                    i++;
                    k++;
                }
                else{
                    numbers[k] =  temp2[j];
                    j++;
                    k++;
                }
        }
            while(i<l1)
            {
                numbers[k] =  temp[i];
                i++;
                k++;
            }
            while(j<l2){
                numbers[k] =  temp2[j];
                j++;
                k++;
            }

    }

}
