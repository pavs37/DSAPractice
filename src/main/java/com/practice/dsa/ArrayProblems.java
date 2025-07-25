package com.practice.dsa;

import java.util.Arrays;

public class ArrayProblems {

    public void moveZeroes(int[] numbers) {
       int j=0;
       for(int i=0;i<numbers.length;i++) {
           if(numbers[i] != 0 && numbers[j]==0) {
               int temp = numbers[j];
               numbers[j] = numbers[i];
               numbers[i] = temp;
           }
           if(numbers[j]!=0)
           {
               j++;
           }
       }
    }
    public static void main(String args[]){
        int[] numbers ={1,7,0,8,0,3,6};
        ArrayProblems arrayProblems = new ArrayProblems();
        arrayProblems.moveZeroes(numbers);
        Arrays.stream(numbers).asLongStream().forEach(System.out::println);
    }
}
