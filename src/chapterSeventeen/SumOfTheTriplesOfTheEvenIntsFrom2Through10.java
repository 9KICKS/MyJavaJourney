package chapterSeventeen;

import java.util.stream.IntStream;

public class SumOfTheTriplesOfTheEvenIntsFrom2Through10 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum());
    }
}
