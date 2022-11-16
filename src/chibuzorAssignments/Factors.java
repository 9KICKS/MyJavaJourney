package chibuzorAssignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        for (int i = 1; i<=userInput; i++) {
            if (userInput % i == 0) {
                counter ++;
            }
        }
        System.out.println(userInput+ " has " +counter+ " factors");
    }
}
