package chapterFifteen;

import java.nio.file.Path;

public class FilesExampleTwo {
    public static void main(String[] args) {
        Path path = Path.of("a", "b", "c.java");
        System.out.println("Path: " + path);
        System.out.println("Path ends with .java: " + path.endsWith(Path.of("c.java")));
    }
}