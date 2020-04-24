public class StringManipulation {
    public static void main(String[] args) {
        String sentence = "I like learning Java";

        int sentenceLength = sentence.length();

        for (int i = sentenceLength - 1; i >=0; i -- ) {
            System.out.print(sentence.charAt(i));
        }

        System.out.println();

        // the same but by using StringBuilder for String manipulation
        StringBuilder sb = new StringBuilder(sentence); // pass in to constructor our string
        // println accepts StringBuilder object too
        System.out.print(sb.reverse());// use build in method
    }
}
