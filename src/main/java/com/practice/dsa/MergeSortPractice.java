package com.practice.dsa;

import java.util.Arrays;

public class MergeSortPractice {

    private void mergesort(int[] arr, int min,int max){
        if(min<max){
            int mid = min + (max-min)/2;
            mergesort(arr,min,mid);
            mergesort(arr,mid+1,max);
            merge(arr,min,mid,max);
        }
    }

    private void merge(int[] arr, int min, int mid, int max) {
       int l1 = mid-min+1;
       int l2 = max-mid;
       int[] firstArray =  new int[l1];
       int[] secondArray = new int[l2];
       System.arraycopy(arr,min,firstArray,0,l1);
       System.arraycopy(arr,mid+1,secondArray,0,l2);

       int i =0;
       int j=0;
       int k =min;
       while(i<l1&&j<l2){
           if(firstArray[i]<secondArray[j]){
               arr[k] =  firstArray[i];
               i++;
               k++;
           }
           else{
               arr[k] =  secondArray[j];
               j++;
               k++;
           }
       }
       while(i<l1){
           arr[k] =  firstArray[i];
           i++;
           k++;
       }
       while(j<l2){
           arr[k] =  secondArray[j];
           j++;
           k++;
       }
    }

    public static void main(String[] args) {
        MergeSortPractice ms = new MergeSortPractice();
        int[] arr = {98,34,76,28,76,48};
        ms.mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
