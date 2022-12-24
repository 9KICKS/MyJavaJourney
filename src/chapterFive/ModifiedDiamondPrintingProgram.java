package chapterFive;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an odd number within the range 1-19: ");
        int userInput = input.nextInt();
        int space = 4;
        for (int i = 1; i < userInput; i+=2) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }

        space = 1;
        for (int i = userInput; i > 0; i-=2) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}