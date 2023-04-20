package chapterSixteen.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample3 {
    public static void main(String[] args) {
        Map<String, Integer> people = new TreeMap<>();
        people.put("Folahan", 98);
        people.put("Damian", 85);
        people.put("Zainab", 109);
        people.put("Deborah", 20);

        System.out.println(people);
    }
}