package com.hwork;

import java.util.Arrays;

public class HwExecute {
    public static void main(String[] args) {
        Prime prime_obj = new Prime();
        for(int i = 1; i <=100; i++){
            if(prime_obj.isPrime(i)){
                System.out.print(i);
            };
        }
        System.out.println();
        prime_obj.getFibonacci(155);
        System.out.println("getFibonacci2:");
        System.out.println(prime_obj.getFibonacci2(6));

        Palindrome myPalindrome = new Palindrome();
        System.out.println(myPalindrome.isPalindrome("mjadam"));

        // Sort & find 2nd smallest number
        MySort mySort = new MySort();
        int[] numbers = {-1, -1, 100, -1, 5, 6, 2, 1, 3};
        int result = mySort.getSmallest(numbers);
        System.out.print(result);
        System.out.println("**********");
        System.out.println(mySort.getSimpleSecond(numbers));

        // check if duplicates
        MyArray m_array = new MyArray();
        String[] arr = {"t", "b", "a", "n", "v", "t"};
       boolean is_duplicate = m_array.isDuplicate(arr);
        System.out.println("Method isDuplicate found duplicates: " + is_duplicate);

        System.out.println("***** printDuplicates *****");
        int[] arr_numbers = {3, 7, 9, 3, 8, 9, 3};
        m_array.printDuplicates(arr_numbers);

        System.out.println("***** printFrequency *****");
        String[] str_arr = {"One", "Two", "Three", "Two", "Eleven", "Three", "Three", "Eight"};
        m_array.printFrequency(str_arr);
    }
}
