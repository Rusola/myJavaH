package com.hwork;

import javax.naming.directory.SearchControls;
import java.util.Arrays;

public class MySort {
    // Find the 2nd smallest
    int getSmallest(int[] numbers) {
        int[] sorted_arr = bubbleSort(numbers);

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


    // This example is from 05.04.20 but I do not agree as fails when {-1, -1, 100, -1, 5, 1, 3}
    int getSimpleSecond(int[] numbers){
        int min = numbers[0];
        int second = min; // I think this assumption is risky!
        for(int number : numbers){
            if(number < min){  // find a new min
                second = min;
                min = number;
            }else if(number < second){
                second = number; // if new elem is bigger then min, but less then second
            }
        }
        return second;
    }
}
