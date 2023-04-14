package semicolonAssessment.level2;

import java.util.Scanner;

public class DecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = 0;
        int position = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            int positionalValue = (int) Math.pow(2, position);
            decimal += digit * positionalValue;
            position++;
        }
        System.out.println("The decimal equivalent of " + binary + " = " + decimal);
    }
}