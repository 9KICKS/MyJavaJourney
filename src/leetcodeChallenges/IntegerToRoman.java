package leetcodeChallenges;

import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to convert to roman numeral: ");
        int userInput = input.nextInt();
        System.out.println("" + userInput + " -> roman numeral = " + integerToRomanNumeral(userInput));
    }
    public static String integerToRomanNumeral(int userInput) {
        if (userInput < 1 || userInput > 3999)
            return "Invalid Roman Number Value";
        StringBuilder userString = new StringBuilder();
        while (userInput >= 1000) {
            userString.append("M");
            userInput -= 1000;
        }
        while (userInput >= 900) {
            userString.append("CM");
            userInput -= 900;
        }
        while (userInput >= 500) {
            userString.append("D");
            userInput -= 500;
        }
        while (userInput >= 400) {
            userString.append("CD");
            userInput -= 400;
        }
        while (userInput >= 100) {
            userString.append("C");
            userInput -= 100;
        }
        while (userInput >= 90) {
            userString.append("XC");
            userInput -= 90;
        }
        while (userInput >= 50) {
            userString.append("L");
            userInput -= 50;
        }
        while (userInput >= 40) {
            userString.append("XL");
            userInput -= 40;
        }
        while (userInput >= 10) {
            userString.append("X");
            userInput -= 10;
        }
        while (userInput == 9) {
            userString.append("IX");
            userInput -= 9;
        }
        while (userInput >= 5) {
            userString.append("V");
            userInput -= 5;
        }
        while (userInput == 4) {
            userString.append("IV");
            userInput -= 4;
        }
        while (userInput >= 1) {
            userString.append("I");
            userInput -= 1;
        }
        return userString.toString();
    }
}
