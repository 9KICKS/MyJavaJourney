package chapterSeventeen;

import java.util.stream.IntStream;

public class SumTheIntegersFrom1Through10WithStreamsAndReduction {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10).sum());
    }
}
