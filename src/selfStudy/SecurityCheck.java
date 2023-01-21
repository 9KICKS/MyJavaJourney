package selfStudy;

import java.util.Collections;
import java.util.Scanner;

public class SecurityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password or passcode: ");
        String userSecret = input.nextLine();
        System.out.println(hideInput(userSecret));
    }

    public static String hideInput(String userInput) {
        int lastFour = Math.min(userInput.length(), 4);
        String maskCode = String.join("", Collections.nCopies(userInput.length() - lastFour, "#"));
        return maskCode + userInput.substring(userInput.length() - lastFour);
    }
}
