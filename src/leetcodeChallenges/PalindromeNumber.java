package leetcodeChallenges;

import java.util.Scanner;

public class PalindromeNumber {
    public static void  main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        int userInput = input.nextInt();
        System.out.println(palindrome(userInput) == 1 ? "True" : "False");
    }
    static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }
    static int palindrome(int number) {
        int reverse = reverseNumber(number);
        if (reverse == number) {
            return 1;
        } else {
            return 0;
        }
    }
}