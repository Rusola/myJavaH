package com.hwork;

import java.util.Arrays;

public class MySort {
    // Find the 2nd smallest
    int getSmallest(int[] numbers) {
        int[] sorted_arr = bubbleSort(numbers);
//        int length = numbers.length;
//
//        // Bubble Sort expected result: 12345
//        for(int i = 1; i < length; i ++) {
//
//            for(int j = length - 1; j  > 0; j--){
//                if(numbers[j] < numbers[j - 1]){
//                    int temp = numbers[j - 1];
//                    numbers[j - 1] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }

        int current_result = sorted_arr[1];
        System.out.println(Arrays.toString(sorted_arr));

        // Find the 2nd smallest number, not just 2nd element in sorted arr
        if(numbers[0] == numbers[1]){
            // Find next different number
            for(int s = 2; s < sorted_arr.length; s ++){
                if(current_result != sorted_arr[s]){
                    return numbers[s];
                }
            }
        }

        // If arr contains only duplicates return this duplicate
        return current_result;
    }

    int[] bubbleSort(int[] numbers) {
        int length = numbers.length;
        // сколько цифр столько и итераций
        for(int i = 1; i < length; i ++) {

            // Start with the last but one & go to the beginning
            for(int j = length - 1; j  > 0; j--){
                if(numbers[j] < numbers[j - 1]){
                    int temp = numbers[j - 1];
                    // shift to the left
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
