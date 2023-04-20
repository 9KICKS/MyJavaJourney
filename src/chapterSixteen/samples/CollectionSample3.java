package chapterSixteen.samples;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample3 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        digits.add(10);
        digits.add(20);
        digits.add(30);
        digits.add(40);

        Integer number = digits.get(2);
        System.out.println(number);
    }
}