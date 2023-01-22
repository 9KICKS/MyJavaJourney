package selfStudy;

import java.util.Scanner;

public class LargestAndSmallestWordInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] userString = input.nextLine().split(" ");

        String largest = userString[0];
        String smallest = userString[0];
        for (String word : userString) {
            if (word.length() > largest.length()) {
                largest = word;
            }
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }
        System.out.println("The largest word is " + largest);
        System.out.println("The smallest word is " + smallest);
    }
}
