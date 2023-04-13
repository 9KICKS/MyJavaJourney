package chapterSixteen;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        Collection<Integer> collection = List.of(11,12,13,14);

        Queue<Integer> collections = new LinkedList<>();
        collections.add(50);
        collections.add(60);
        collections.add(70);
        collections.add(80);

        List<Integer> digits = new ArrayList<>(30);
        digits.add(10);
        digits.add(20);
        digits.add(30);
        digits.add(40);
        digits.add(1, 100);
        digits.remove((Integer) 10);
        digits.addAll(collections);
        System.out.println(digits);

//        List<Integer> syncList = Collections.synchronizedList(numbers);
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<String> words = Arrays.asList("QWERTY", "ASDFG", "ZXCVB");
        List<String> names = List.of("Folahan", "Joshua", "9KICKS");
    }
}