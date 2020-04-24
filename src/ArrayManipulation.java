public class ArrayManipulation {
    public static void main(String[] args) {
        // Array is an object in Java
        // Declaration
         int[] intArray; // a reference variable intArray
        // Initialization
         intArray = new int[67]; // now intArray is pointing to object with 67 places in HEAP;

        String[] strArray = new String[2]; // now strArray is pointing to 2 places in HEAP which in turn will point later to String obj;
        strArray[0] = new String("Tony");
        strArray[1] = "Vlady";

        for(int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        // for each
        for( String elem : strArray){
            System.out.println(elem);
        }

        // simple initialization for Strings & primitives
        String[] family = {"Alice", "Peter"};

    }
}
