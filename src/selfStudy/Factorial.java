package selfStudy;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        for (int i = userInput - 1; i >= 1; i--) {
            userInput = userInput * i;
        }
        System.out.println("Factorial is " + userInput);
    }
}
