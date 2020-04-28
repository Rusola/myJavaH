package hwork;

import java.util.Arrays;

public class ReverseHW {
    public static void main(String[] args) {
        //вывести слова в обратном порядке
        String sentence = "I like learning Java";

        String[] words = sentence.split(" ");
        // variant 1
        for(int i = words.length - 1; i >=0; i --){
            System.out.printf("%s ", words[i]);
        }
        // variant 2
        String reverse = "";
        for (String word : words){
            reverse = word + " " + reverse;
        }
        System.out.println(reverse);


        ReverseHW obj = new ReverseHW();
        boolean is_anagram = obj.isAnagram( "debit card", "bad credit");
        System.out.println("Anagram: " + is_anagram);
    }

    public boolean isAnagram( String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char [] letters_from_1 = str1.toCharArray();
        char [] letters_from_2 = str2.toCharArray();

        Arrays.sort(letters_from_1);
        System.out.println(letters_from_1);
        Arrays.sort(letters_from_2);
        System.out.println(letters_from_2);
// no necessary to work with Strings
//        String new_str1 =  new String(letters_from_1);
//        String new_str2 =  new String(letters_from_2);

//        return letters_from_1.equals(letters_from_2);

        return Arrays.equals(letters_from_1, letters_from_2);
    }
}
