package selfStudy;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        int numberOfLoopExecutions = 0;
        for (int counter = userInput -1; counter >= 1; counter--) {
            System.out.println("Number--> " +userInput);
            System.out.println("counter--> " +counter);
            System.out.println(userInput+ " *   " +counter);
            System.out.println("Number--> " +userInput);
            }
            System.out.println("Factorial is " + userInput);
    }
}
