package selfStudy;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();
        int birthday = 2023 - birthYear;
        guessing();
        System.out.println("You are " + birthday + " years old.");
    }

    private static void guessing() {
        System.out.println();
        System.out.println("Guessing your age");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}
