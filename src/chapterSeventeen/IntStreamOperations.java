package chapterSeventeen;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.println("Array elements: " + IntStream.of(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
        System.out.println("Array Length: " + IntStream.of(values).count());
        System.out.println("Minimum element: " + IntStream.of(values).min().getAsInt());
        System.out.println("Maximum element: " + IntStream.of(values).max().getAsInt());
        System.out.println("Sum of the elements: " + IntStream.of(values).sum());
        System.out.println("Average of the elements: " + IntStream.of(values).average().getAsDouble());
        System.out.println("Sum of the elements: " + IntStream.of(values).reduce(0, (x, y) -> x + y));
        System.out.println("Sum of the elements: " + IntStream.of(values).reduce((x, y) -> x + y).getAsInt());
        System.out.println("Product of the elements: " + IntStream.of(values).reduce((x, y) -> x * y).getAsInt());
        System.out.println("Product of the elements: " + IntStream.of(values).reduce(1, (x, y) -> x * y));
        System.out.println("Sum of the squares: " + IntStream.of(values)
                .map(x -> x * x)
                .sum());
        System.out.println("Sorted array: " + IntStream.of(values)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println(IntStream.of(values).summaryStatistics());
    }
}