package streamsAndLambdas;

import java.util.*;
import java.util.stream.*;

public class SortTheMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Folahan", 21);
        myMap.put("B", 22);
        myMap.put("AB", 22);
        myMap.put("Tayo", 24);

        Map<String, Integer> sorted = myMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        stringIntegerEntry -> stringIntegerEntry.getKey(),
                        Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new));
        System.out.println(sorted);
    }
}