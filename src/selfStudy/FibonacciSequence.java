package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("The fibonacci sequence = " + Arrays.toString(fibonacciSeries(userInput)));
    }

    public static int[] fibonacciSeries(int userInput) {
        int[] series = new int[userInput];
        series[0] = 0;
        if (userInput > 1) {
            series[1] = 1;
            for (int i = 2; i < userInput; i++) {
                series[i] = series[i-1] + series[i-2];
            }
        }
        return series;
    }
}
