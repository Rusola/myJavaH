package com.hwork;

import java.util.Arrays;

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
}

