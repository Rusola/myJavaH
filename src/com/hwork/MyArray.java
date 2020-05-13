package com.hwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class MyArray {

   protected boolean isDuplicate(String[] arr){
       Arrays.sort(arr);
       for( int i = 0; i < arr.length - 1; i ++){
           if(arr[i] == arr[i + 1]){
               return true;
           }
       }
       return false;
   }

   // or
   protected boolean isDuplicateWithSet(String[] arr) {
       var set = new HashSet<String>();
       // поместить все элементы по одному в set
       for (String word: arr) {
           set.add(word);
       }

       if(set.size() == words.length){

           // there is no duplicates
           return false;
       }
       // there are duplicates
       return true;
   }

   protected void printDuplicates(int[] arr){
       Arrays.sort(arr);
       for( int i = 0; i < arr.length - 1; i ++){
           if(arr[i] == arr[i + 1]){
               System.out.println(arr[i]);
           }
       }
   }

   // or
   protected void printDuplicates2(int[] arr) {

   }


   // распечатать частоту элементов в массиве ["One", "Two", "Three", "Two", "Eleven", "Three", "Three", "Eight"]
    protected  void printFrequency(String[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 1;
        boolean duplicate = false;
        for( int i = 0; i < arr.length - 1; i ++){
            if(arr[i] == arr[i + 1]) {
                count++;
            }else{
                System.out.println(arr[i] + " : " + count);
                count = 1;
            }

            if(i + 1 == arr.length - 1) {
                System.out.println(arr[i + 1] + " : " + count);
            }
        }
    }

    protected void nonstopUntil(int n){
       for( int i = 0; ; i ++, i = i%n){
           System.out.println(i);
       }
    }
}

