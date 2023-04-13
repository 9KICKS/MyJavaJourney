package chapterSixteen;

import java.util.LinkedList;
import java.util.List;

public class CollectionSample4 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Folahan");
        names.add("Joshua");
        System.out.println(names);

        boolean b = names.contains("Folahan");
        System.out.println(b);

        List<String> list = List.of("SHOP", "9KICKS");
        boolean b1 = names.containsAll(list);
        System.out.println(b1);

        System.out.println(names.get(0));
    }
}