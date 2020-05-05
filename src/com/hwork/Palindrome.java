package com.hwork;

public class Palindrome{

    //  reads the same backward as forward
    boolean isPalindrome(String word){
        word = word.toLowerCase();
        int last = word.length() - 1; // 10 11
        for(int i = 0; i <= last/2; i ++){
            if (word.charAt(i) != word.charAt(last - i)){
                return false;
            }
        }
        return true;
    }
}
