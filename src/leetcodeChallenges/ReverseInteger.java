package leetcodeChallenges;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInteger = input.nextInt();
        int reversed = 0;
        while(userInteger != 0) {
            int number = userInteger % 10;
            reversed = reversed * 10 + number;
            userInteger /= 10;
        }
        System.out.println("Reversed integer is " + reversed);
    }
}
