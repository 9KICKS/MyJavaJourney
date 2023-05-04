package streamsAndLambdas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterOutAllNegativeElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 1, 39, 44, -23, -23};
        System.out.println("Array without the negative elements = " + Arrays.toString(IntStream.of(numbers)
                .filter(x -> x >= 0).toArray()));
    }
}
