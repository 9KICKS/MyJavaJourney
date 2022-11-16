package chapterFour;

import java.util.Scanner;

public class SingleSelection2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        if(userInput > 10) {
            System.out.print("Out of range");
        }
        else if(userInput % 2 == 0) System.out.print("This is even");
            else System.out.println("This is odd");

    }
}
