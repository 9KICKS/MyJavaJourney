package chapterSixteen.map;

import java.util.*;

public class MapSample4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List before sorting " + list);
        Collections.sort(list);
        System.out.println("List after sorting " + list);

        Collections.shuffle(list);
        System.out.println("List after shuffling " + list);

        System.out.println("Maximum element = " + Collections.max(list));
        System.out.println("Minimum element = " + Collections.min(list));
    }
}