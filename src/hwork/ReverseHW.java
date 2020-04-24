package hwork;

public class ReverseHW {
    public static void main(String[] args) {
        //вывести слова в обратном порядке
        String sentence = "I like learning Java";
        String[] words = sentence.split(" ");
        for(int i = words.length - 1; i >=0; i --){
            System.out.printf("%s ", words[i]);
        }
    }
}
