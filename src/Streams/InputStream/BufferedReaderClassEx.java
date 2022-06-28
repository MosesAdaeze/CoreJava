package Streams.InputStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderClassEx {
    public static void main(String[] args) {
        //create an array of characters
        char[] array = new char[100];
        try {
            FileReader file = new FileReader("C:\\String\\input.txt");

            //creates a BufferedReader
            BufferedReader input = new BufferedReader(file);

            //skips the 5 charaters
//            input.skip(10);

//            // Reads the charaters
            input.read(array);
//
//            System.out.println("Data after skipping 5 charaters: ");
            System.out.println(array);

            // closes the reader
//            input.close();
        }
        catch(Exception e){
                e.getStackTrace();
            }
        }
}
