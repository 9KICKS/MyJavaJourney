package chapterSixteen.samples;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample8 {
    public static void main(String[] args) {
        Customer customer = new Customer(5, "Folahan", 3_000_000.00);
        Customer customerTwo = new Customer(1, "Joshua", 300_000.00);
        Customer customerThree = new Customer(10, "Omisakin", -300_000.00);

        Comparator<Customer> comparator = (c1, c2)-> {
            if (c1.getId() > c2.getId()) return 1;
            else if (c2.getId() > c1.getId()) return - 1;
            return 0;
        };

        Set<Customer> customers = new TreeSet<>(comparator);
        customers.add(customer);
        customers.add(customerTwo);
        customers.add(customerThree);

        System.out.println(customers);
    }
}