package chapterSeventeen.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<String> words = List.of(
                "AAA",
                "AAA",
                "BBB",
                "QWERTY",
                "ASDFG",
                "ZXCVB"
        );

        Map<Boolean, List<String>> map = words.stream().
                collect(Collectors.partitioningBy((w)->w.length() % 2 == 0));
        System.out.println("List -> " + map);

        Map<Boolean, Set<String>> map2 = words.stream().
                collect(Collectors.partitioningBy((w)->w.length() % 2 == 0, Collectors.toSet()));
        System.out.println("Set -> " + map2);
    }
}
