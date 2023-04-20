package chapterSixteen.samples;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSample7 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Tinuade");
        names.add("Tayo");
        names.add("Timothy");
        names.add("Tinuke");
        System.out.println(names);
    }
}