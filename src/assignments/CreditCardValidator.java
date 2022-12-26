package assignments;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String creditCardType;
        String cardValidity;
        System.out.println("Hello, kindly enter card details to verify: ");
        String creditCard = input.nextLine();
        int evenDigitsTotal = doubledEvenDigits(creditCard);
        int oddDigitsTotal = sumOddDigits(creditCard);
        int sumOfTotal = evenDigitsTotal + oddDigitsTotal;

        if (sumOfTotal % 10 == 0) {
            cardValidity = "Valid Card";
        } else {
            cardValidity = "Invalid Card";
        }
        int firstIndex = Integer.parseInt(String.valueOf(creditCard.charAt(0)));
        int secondIndex = Integer.parseInt(String.valueOf(creditCard.charAt(1)));
        if (firstIndex == 4) {
            creditCardType = "Visa Card";
        } else if (firstIndex == 5) {
            creditCardType = "MasterCard";
        } else if (firstIndex == 6) {
            creditCardType = "Discover Card";
        } else if ((firstIndex == 3) && (secondIndex == 7)) {
            creditCardType = "American Express Card";
        } else {
            creditCardType = "Input correct card details";
        }
        System.out.println();
        asterisks();
        System.out.println("**Credit Card Type: " +creditCardType);
        System.out.println("**Credit Card Number: " +creditCard);
        System.out.println("**Credit Card Digit Length: " +creditCard.length());
        System.out.println("**Credit Card Validity Status: " +cardValidity);
        asterisks();
    }

    private static int sumOddDigits(String creditCard) {
        int addition = 0;
        for (int i = creditCard.length() - 1; i >= 0; i -= 2) {
           int oddDigits = Integer.parseInt(String.valueOf(creditCard.charAt(i)));
           addition += oddDigits;
        }
        return addition;
    }
    private static int doubledEvenDigits(String creditCard) {
        int sum = 0;
        for (int i = creditCard.length() - 2; i >= 0 ; i -= 2) {
            int evenDigits = Integer.parseInt(String.valueOf(creditCard.charAt(i))) * 2;
            if(evenDigits >= 10){
                evenDigits = convertToSingleDigit(evenDigits);
            }
            sum += evenDigits;
        }
        return sum;
    }

    private static int convertToSingleDigit(int evenDigits) {
        String stringDigit = String.valueOf(evenDigits);
        return Integer.parseInt(String.valueOf(stringDigit.charAt(0))) + Integer.parseInt(String.valueOf(stringDigit.charAt(1)));
    }

    private static void asterisks() {
        String asterisks = "*";
        System.out.println(asterisks.repeat(45));
    }
}
