package selfStudy;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToBeGuessed = (int)(Math.random() * 100) + 1;
        int numberOfGuesses = 0;
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            numberOfGuesses++;
            if (guess == numberToBeGuessed) {
                System.out.println("Congratulations! You guessed right");
                System.out.println("It only took you " + numberOfGuesses + " guesses.");
                break;
            }
            else if (guess < numberToBeGuessed) {
                System.out.println("Your guess is too low! Guess again.");
            }
            else {
                System.out.println("Your guess is too high! Guess again.");
            }
        }
    }
}
