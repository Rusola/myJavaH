import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String sentence = "I like learning Java";

        int sentenceLength = sentence.length();
        // reverse the string
//        for (int i = sentenceLength - 1; i >=0; i -- ) {
//            System.out.print(sentence.charAt(i));
//        }

        System.out.println();

        // the same string reverse but by using StringBuilder for String manipulation
        StringBuilder sb = new StringBuilder(sentence); // pass in to constructor our string
        // println accepts StringBuilder object too
       // System.out.print(sb.reverse());// use build in method

        // Create an array of chars
        char[] chars = {'S', 'A', 'R', 'A', 'H'};
        String name = new String (chars); // склеить в слово
        System.out.println(name);

        String[] words = sentence.split(" "); // разделить на массив
        for(String word: words){ // распечатать можно все
            System.out.println(word);
        }

        // the same splitting
        char[] words1 = sentence.toCharArray();

        // отсортировать по алфавитую Пробелы будут впереди!
        Arrays.sort(words1);
        System.out.println(words1);
    }
}
