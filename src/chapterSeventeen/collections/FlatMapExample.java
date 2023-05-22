package chapterSeventeen.collections;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> list = List.of(
                "A", "Good", "Day", "To", "Shop", "9KICKS!"
        );

        list.stream()
                .flatMap(s -> Stream.of(s.split("")))
                .forEach(System.out::println);
    }
}
