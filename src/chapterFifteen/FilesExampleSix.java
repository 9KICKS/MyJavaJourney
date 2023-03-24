package chapterFifteen;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesExampleSix {
    public static void main(String[] args) {
        try (var fileOutputStream = new FileOutputStream("C:\\Users\\Omisakin Joshua\\IdeaProjects\\folahanProject\\src\\chapterFifteen\\test_output.txt")) {
            byte[] bytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
            fileOutputStream.write(bytes);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}