package chapterSixteen.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample6 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(16);
        numbers.add(1);
        System.out.println(numbers);

        Set<Integer> digits = new HashSet<>();
        digits.add(30);
        digits.add(10);
        digits.add(16);
        digits.add(1);
        System.out.println(digits);
    }
}