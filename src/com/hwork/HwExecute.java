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
    }
}
