package chapterSixteen.samples;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectonSample9 {
    public static void main(String[] args) {
        Customer customer = new Customer(5, "Folahan", 3_000_000.00);
        Customer customerTwo = new Customer(1, "Joshua", 300_000.00);
        Customer customerThree = new Customer(10, "Omisakin", -300_000.00);

        Set<Customer> customers = new TreeSet<>(Comparator.reverseOrder());
        customers.add(customer);
        customers.add(customerTwo);
        customers.add(customerThree);

        System.out.println(customers);
    }
}