package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreateFileWithFileAttribute {
    public static void main(String[] args) {

        Path run = Paths.get("C:\\String\\Input.txt");
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw-");
        FileAttribute<Set<PosixFilePermission>> attr =PosixFilePermissions.asFileAttribute(perms);

//        Files.createFile(run, attr);
    }
}
