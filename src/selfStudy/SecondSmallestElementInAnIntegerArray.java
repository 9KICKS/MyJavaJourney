package selfStudy;

import java.util.stream.IntStream;

public class SecondSmallestElementInAnIntegerArray {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 3, 14, -5, -16, 67, 8, -9, 0};
        System.out.println("The second smallest element: " + IntStream.of(numbers)
                .sorted()
                .skip(1)
                .findFirst().getAsInt());
    }
}
