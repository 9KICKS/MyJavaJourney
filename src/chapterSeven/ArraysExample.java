package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 9;
        numbers[1] = 8;
        numbers[9] = 100;
        numbers[4] = 29;
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        int tenthItem = numbers[9];
        System.out.println(tenthItem);
// Or System.out.println(numbers[9]);

        System.out.println();

        System.out.println("How many scores you wan add? ");
        int numberOfScores = scanner.nextInt();
        int [] scores = new int[numberOfScores];
        int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter score " + (index + 1) + ":");
            scores[index] = scanner.nextInt();
        }

        System.out.println("After storing scores --> " +Arrays.toString(scores));

        for (int index = 0; index < scores.length; index++) {
            sum += scores[index];
        }

        System.out.println("Sum of scores is " +sum);
    }
}
