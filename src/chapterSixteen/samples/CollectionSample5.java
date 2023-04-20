package chapterSixteen.samples;

import java.util.HashSet;
import java.util.Set;

public class CollectionSample5 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Folahan");
        names.add("Joshua");
        names.add("Omisakin");
        names.add("9KICKS!");

        System.out.println(names);
        System.out.println(names.toArray()[names.toArray().length - 4]);
    }
}