package selfStudy;

import java.util.Scanner;

public class FractionExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        double fraction = 0;
        for (int i = 1; i <= userInput; i++) {
            fraction += (1.0 / i);
        }
        System.out.println(fraction);
    }
}