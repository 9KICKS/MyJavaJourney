package leetcodeChallenges;

import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int dividend = input.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = input.nextInt();
        System.out.println("Quotient: " + divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return sign * quotient;
    }
}
