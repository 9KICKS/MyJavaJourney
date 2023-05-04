package streamsAndLambdas;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SecondLargestElementInAnIntegerArray {
    public static void main(String[] args) {
        int[] numbers = {100, 37, 383, 389, 32, 28, 292, 1003};
        int secondLargest = IntStream.of(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Second largest element: " + secondLargest);
    }
}
