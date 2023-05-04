package streamsAndLambdas;

import java.util.stream.IntStream;

public class NumberOfElementsGreaterThanTheAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 1, 39, 44, -23, -23};
        double average = IntStream.of(numbers).average().getAsDouble();
        System.out.println("The average = " + average);
        IntStream.of(numbers)
                .filter(x -> x > average)
                .forEach(x -> System.out.println(x + " > average"));
    }
}
