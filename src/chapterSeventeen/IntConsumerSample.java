package chapterSeventeen;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(69);
    }
}
