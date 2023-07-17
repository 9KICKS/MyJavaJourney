package selfStudy;

import java.util.Scanner;

public class ReverseAnInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("Reversed int = " + reverseInt(userInt));
    }

    public static String reverseInt(int userInt) {
        String reversed = "";
        while (userInt != 0) {
            int digit = userInt % 10;
            reversed = reversed + digit;
            userInt /= 10;
        }
        return reversed;
    }
}
