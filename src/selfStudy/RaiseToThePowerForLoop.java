package selfStudy;

import java.util.Scanner;

public class RaiseToThePowerForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int raiseToPower = 1;
        for (int i = 0; i <= secondNumber; i++) {
            raiseToPower *= firstNumber;
        }
        System.out.println("Raised to the power = " +raiseToPower);
    }
}
