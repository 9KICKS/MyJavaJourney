package chapterSixteen.map;

import chapterSixteen.samples.Customer;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MapSample5 {
    public static void main(String[] args) {
        List<Customer> list = new LinkedList<>();
        list.add(new Customer(1, "Sgreen", 234_567));
        list.add(new Customer(2, "Madam Ugo", 65_443));
        list.add(new Customer(3, "Prof", 76_554));

        System.out.println("Before sorting: " + list);

        Comparator<Customer> comparator = (c1, c2) -> {
            if (c1.getBalance() < c2.getBalance()) return 1;
            else if (c2.getBalance() < c1.getBalance()) return - 1;
            return 0;
        };

        Collections.sort(list, comparator);
        System.out.println("After sorting: " + list);
    }
}