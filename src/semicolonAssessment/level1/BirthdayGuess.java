package semicolonAssessment.level1;

import java.util.Scanner;

public class BirthdayGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthDate = 9;
        int numberOfGuesses = 5;
        System.out.println("You got my birthday year and month.");
        System.out.println("Can you guess what my birthdate is?");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;
            if (guess == birthDate) {
                System.out.println("Correct Guess!");
                break;
            }
            else if (guess < birthDate) {
                System.out.println("Incorrect Guess! Your guess is too low.");
            }
            else {
                System.out.println("Incorrect Guess! Your guess is too high.");
            }
        }
    }
}