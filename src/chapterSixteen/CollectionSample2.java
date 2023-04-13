package chapterSixteen;

import java.util.*;

public class CollectionSample2 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        digits.add(10);
        digits.add(20);
        digits.add(30);
        digits.add(40);

        digits.remove((Integer) 10);
        digits.remove(0);
        System.out.println(digits);
    }
}