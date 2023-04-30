package chapterSeventeen;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] colours = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        System.out.println("Initial array: " + Arrays.asList(colours));
        System.out.println("Arrays in uppercase: " + Arrays.stream(colours)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
        System.out.println("Strings less than 'n' (case insensitive) sorted ascending: " + Arrays.stream(colours)
                .filter(x -> x.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList()));
        System.out.println("Strings less than 'n' (case insensitive) sorted descending: " + Arrays.stream(colours)
                .filter(x -> x.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }
}
