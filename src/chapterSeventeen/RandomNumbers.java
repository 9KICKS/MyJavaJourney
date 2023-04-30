package chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        System.out.println("Random numbers on separate lines:");
        secureRandom.ints(10, 1, 7)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Random numbers on a single line: " + secureRandom.ints(10, 1, 7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
