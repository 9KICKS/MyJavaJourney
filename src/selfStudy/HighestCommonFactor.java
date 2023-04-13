package selfStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userInput = new ArrayList<>();
        System.out.println("Enter a list of numbers separated by ',': ");
        String[] input = scanner.nextLine().split(",");
        for (String number : input) {
            userInput.add(Integer.parseInt(number.trim()));
        }
        List<Integer> result = getHighestCommonFactor(userInput);
        System.out.println(result);
    }

    private static List<Integer> getHighestCommonFactor(List<Integer> userInput, int... arg) {
        int highestCommonFactor = userInput.get(0);
        for (int i = 1; i < userInput.size(); i++) {
            highestCommonFactor = getGreatestCommonDivisor(highestCommonFactor, userInput.get(i));
        }
        return getPrimeFactors(highestCommonFactor);
    }

    public static int getGreatestCommonDivisor(int x, int y) {
        if (y == 0) {
            return x;
        }
        return getGreatestCommonDivisor(y, x % y);
    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (i <= number) {
            if (number % i == 0) {
                number /= i;
                factors.add(i);
            } else {
                i++;
            }
        }
        if (number > 1) {
            factors.add(number);
        }
        return factors;
    }
}