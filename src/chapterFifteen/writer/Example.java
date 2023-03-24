package chapterFifteen.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Omisakin Joshua\\IdeaProjects\\folahanProject\\src\\chapterFifteen\\test_output.txt", true)) {
            fileWriter.append("Thank God it's Friday.");
            fileWriter.append("Hurray.");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}