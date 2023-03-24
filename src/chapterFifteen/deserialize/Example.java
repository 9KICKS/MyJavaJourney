package chapterFifteen.deserialize;

import chapterFifteen.serialize.Dog;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Omisakin Joshua\\IdeaProjects\\folahanProject\\dog"))) {
            var dog = (Dog) objectInputStream.readObject();
            System.out.println(dog);
        } catch (IOException | SecurityException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}