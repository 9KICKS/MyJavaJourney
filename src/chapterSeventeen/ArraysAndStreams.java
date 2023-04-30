package chapterSeventeen;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
        System.out.println("Initial array: " + Arrays.asList(values));
        System.out.println("Sorted array: " + Arrays.stream(values)
                .sorted()
                .toList());
        System.out.println("Elements > 4: " + Arrays.stream(values)
                .filter(x -> x > 4)
                .toList());
        System.out.println("Sorted elements > 4: " + Arrays.stream(values)
                .filter(x -> x > 4)
                .sorted()
                .toList());

    }
}
