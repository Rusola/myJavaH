import java.io.FileNotFoundException;

public class TestExceptions {
    public static void main(String[] args) {
        int i = 3;
        int j = 0;
        try{
            switch(i){
                case 1 -> System.out.println(i/j); // provoke arithmetic exception
                case 2 -> {
                    int[] arr = new int[6];
                    i = arr[9]; // provoke String IndexOutOfBound Exception
                }
                case 3 -> {
                    String str = "abc";
                    char ch = str.charAt(99); // provoke
                }
            }
        }
//        catch (FileNotFoundException e ){
//            more then one, so do it in the right order
//        }
        catch(Exception e){ // Exception e = new ArithmeticException();
            System.out.println(e); // e is an object, but print can work only with String, so behind the scene it is smart to find Object.toString() for e
        }
    }
}
