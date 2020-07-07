package files;

import java.io.*;
import java.util.Properties; // class that can read files with key value pairs
import java.util.Scanner; // читает без key value pairs

public class Files {
    public static void main(String[] args) {

        /** read from file (key value pairs needed) */
        Properties prop = new Properties();
        String browser = "no browser found", os = "no os found";
        try {
            prop.load(new FileInputStream("src/files/any_config.txt")); // загрузи инфу из потока, для помещеня в поток ищет файл с уровня проекта, i/o package will require try catch

           browser = prop.getProperty("browser");// теперь можно считывать
            os = prop.getProperty("OS");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("MY Browser is: " + browser + "\nmy os is: " + os);

        /** read from file (no key value needed) */

        var abstract_pathname = new File("src/files/notKeyValueFile.txt"); // Creates a new File instance by converting the given pathname string into an abstract(system-independent) pathname
        try {
            Scanner scanned_file = new Scanner(abstract_pathname);// parse, breaks into tokens using a delimiter pattern (default: whitespace)
            while(scanned_file.hasNextLine()){  // двигаемся по сторкм файла пока строки существуют. Мы не знаем скольео будет строк => while
                System.out.println(scanned_file.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /** write into a file */
        var abstract_pathname2 = new File("src/files/create_new_file.txt");
        try {
            var my_writer = new PrintWriter(abstract_pathname2); // create obj that can write to a text-output stream. Automatic flushing is NOT enabled!
            my_writer.println("This will be the 1st line"); // write to a text-output stream
            my_writer.println("This will be the 2nd line"); // write to a text-output stream
            my_writer.close(); // не забыть смыть из потока(очистить buffer) в файл
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
