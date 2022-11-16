package chapterFour;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        //collect the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        if (userInput % 2 == 0) {
            System.out.println("It is even");
        }
        else {
            System.out.println("It is odd");
        }

    }

}
