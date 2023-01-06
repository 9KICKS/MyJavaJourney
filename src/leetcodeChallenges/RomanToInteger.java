package leetcodeChallenges;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a roman numeral: ");
        String romanNumeral = input.nextLine();
        int result = romanNumeralToInteger(romanNumeral);
        System.out.println("Result -> " + romanNumeral + " = " + result);
    }
    private static int romanNumeralToInteger(String romanNumeral) {
        int result = 0;
        int initialValue = 0;
        int newValue;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            newValue = getValue(romanNumeral.charAt(i));
            if (newValue < initialValue) {
                result -= newValue;
            }
            else {
                result += newValue;
            }
            initialValue = newValue;
        }
        return result;
    }
    private static int getValue(char charAt) {
        return switch (charAt) {
            case 'I', 'i' -> 1;
            case 'V', 'v' -> 5;
            case 'X', 'x' -> 10;
            case 'L', 'l' -> 50;
            case 'C', 'c' -> 100;
            case 'D', 'd' -> 500;
            case 'M', 'm' -> 1000;
            default -> 0;
        };
    }
}
