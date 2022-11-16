package chibuzorAssignments;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        int i;
        int multiply = 0;
        for (i = 0; i <= 12; i++) {
            multiply = userInput * i;
        }
        System.out.println(userInput + " times " + i++ + " is " + multiply);
    }
}
