package com.hwork;

public class Recursion {
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        int factorial = obj.getFactorial2(8);

        // get one final result of multiplying all numbers
        System.out.println(factorial);

        int sum = obj.getSum(3);

        // get one final result of all numbers sum
        System.out.println(sum);

    }

    // using loop
    public int getFactorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i ++){
            fact = fact * i;
        }
        return fact;
    }
    // using recursion
    public int getFactorial2(int n){
        if(n == 1) {
            return 1;
        }
        return n * getFactorial2(n - 1);
    }

    public int getSum(int n){
        if(n == 0) {
            return 0;
        }
        return n + getSum(n - 1);
    }
}
