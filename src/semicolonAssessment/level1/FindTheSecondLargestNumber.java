package semicolonAssessment.level1;

import java.util.Arrays;
import java.util.List;

public class FindTheSecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int secondLargest = secondLargest(list);
        System.out.println("Second largest number is: " + secondLargest);
    }

    public static int secondLargest(List<Integer> list) {
        int maximum = Integer.MIN_VALUE;
        int second_maximum = Integer.MIN_VALUE;
        for (int number : list) {
            if (number > maximum) {
                second_maximum = maximum;
                maximum = number;
            } else if (number > second_maximum && number != maximum) {
                second_maximum = number;
            }
        }
        return second_maximum;
    }

}