package chapterSeventeen;

import java.util.stream.IntStream;

public class SumOfTheEvenIntegersFrom2Through20 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .map(i -> i * 2)
                .sum());
    }
}