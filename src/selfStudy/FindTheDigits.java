package selfStudy;

import java.util.Scanner;

public class FindTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array: ");
        String userString = input.nextLine();
        int count = findTheTotalDigits(userString);
        System.out.println("The total amount of digits = " + count);
    }

    public static int findTheTotalDigits(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (Character.isDigit(userString.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}