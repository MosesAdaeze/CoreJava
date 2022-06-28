package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileExample1 {
    public static void main(String[] args) {
        Path run = Paths.get("");
        //        Files.createFile(run) = CreateFileExample1;

        try{
            Files.createFile(run);
        }catch (Exception e) {
//            e.File.createFile();
        }
    }
}
