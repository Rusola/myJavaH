package com.hwork;

public class Prime {
    // найти простое ли число 2, 3, 5, 7
    boolean isPrime(int number) {
        if (number <= 2)
            return true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    void getFibonacci(int upToNumber) {
        int first = 1;
        int second = 2;

        System.out.printf("%d %d", first, second);

        while(first + second <=upToNumber){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
    // др условие: найти элемент стоящий на n-месте из ряда фибоначи: 0 1 1 2 3 5 8 ...Входное n пусть всегда > 1
    int getFibonacci2(int n){

        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return getFibonacci2(n - 1) + getFibonacci2(n - 2);
    }
}

