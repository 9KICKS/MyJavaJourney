 package chapterFour;

import java.util.Scanner;

public class LargestAndSmallestLoopAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        int userInput;
        do {
            userInput = 0;
            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            if (userInput < smallestNumber) {
                smallestNumber = userInput;
            }
            System.out.println("Enter a number, enter '0' to exit: ");
            userInput = input.nextInt();
        }
        while (userInput != 0);

        System.out.println("The largest number is " + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);
    }
}
