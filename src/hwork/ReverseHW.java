package hwork;

import java.util.Arrays;

public class ReverseHW {
    public static void main(String[] args) {
        //вывести слова в обратном порядке
//        String sentence = "I like learning Java";
//        String[] words = sentence.split(" ");
//        for(int i = words.length - 1; i >=0; i --){
//            System.out.printf("%s ", words[i]);
//        }

        ReverseHW obj = new ReverseHW();
        boolean is_anagram = obj.isAnagram( "debit card", "bad credit");
        System.out.println(is_anagram);

        int factorial = obj.getFactorial(8);
        System.out.println(factorial);


    }

    public boolean isAnagram( String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char [] letters_from_1 = str1.toCharArray();
        char [] letters_from_2 = str2.toCharArray();

        Arrays.sort(letters_from_1);
        Arrays.sort(letters_from_2);

        String new_str1 =  new String(letters_from_1);
        String new_str2 =  new String(letters_from_2);

        return new_str1.equals(new_str2);
    }

    public int getFactorial(int number){
        int fact = 1;
        for(int i = 1; i <=number; i ++){
            fact = fact * i;
        }
        return fact;
    }
}
