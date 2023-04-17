package selfStudy;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to check if it's a leap year: ");
        int userYear = scanner.nextInt();
        System.out.println(findLeapYear(userYear));
    }

    private static boolean findLeapYear(int userYear) {
        boolean isLeapYear = false;
        if (userYear % 4 == 0) {
            if (userYear % 100 == 0) {
                if (userYear % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(userYear + " is a leap year.");
        } else {
            System.out.println(userYear + " is not a leap year.");
        }
        return isLeapYear;
    }
}