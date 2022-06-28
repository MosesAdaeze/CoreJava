package Streams.OutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamClassEx {
    public static void main(String[] args) {

        String data = "This is a another line of text inside the file";

        try{
            //Create a fileOutputStream
            FileOutputStream file = new FileOutputStream("C:\\String\\input.txt");

            //Create a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);
            byte[] array = data.getBytes();

            //Writes data to the output stream
            output.write(array);

            //Flushes data to the destination
            output.flush();
            
            System.out.println("Data is flushed to the file.");
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
