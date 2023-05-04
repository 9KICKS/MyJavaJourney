package streamsAndLambdas;

import java.util.List;
import java.util.stream.Collectors;

public class FindTheStringAndLength {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Felix",
                "Prof",
                "Joshua",
                "Zainab",
                "Deborah"
        );
        System.out.println(names.stream()
                .collect(Collectors.toMap(String::toString, String::length)));
    }
}
