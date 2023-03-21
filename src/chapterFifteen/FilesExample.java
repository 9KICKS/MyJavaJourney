package chapterFifteen;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {
        Path path = Paths.get("a/b/c/../../b");
        Path path2 = Paths.get("a", "b", "c.java");
        System.out.println(path2);

        System.out.println("File name: " + path.getFileName());
        System.out.println("File system: " + path.getFileSystem());
        System.out.println("Normal path: " + path.normalize());
        System.out.println("Root: " + path.getRoot());
    }
}