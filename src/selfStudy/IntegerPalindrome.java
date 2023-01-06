package selfStudy;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's a palindrome: ");
        int userInput = input.nextInt();
        int remainder, sum = 0, temp;
        temp = userInput;
        while(userInput > 0) {
            remainder = userInput % 10;
            sum = (sum * 10) + remainder;
            userInput = userInput / 10;
        }
        if(temp == sum) {
            System.out.println("Your input is a palindrome");
        } else {
            System.out.println("Your input is not a palindrome");
        }
    }
}
