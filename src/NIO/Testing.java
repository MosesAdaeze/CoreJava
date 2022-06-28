package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Testing {
    public static void main(String[] args) {
        Path run = Paths.get("C:\\String\\Input.txt");

        //getFilename method: is used to get the name of the file with extensions.

        //Using get file method.
//        System.out.println(run.getFileName());
//        System.out.println(run.getFileSystem());

        System.out.println(run.getParent());
    }
}
