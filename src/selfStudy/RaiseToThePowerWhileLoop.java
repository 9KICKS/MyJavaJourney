package selfStudy;

import java.util.Scanner;

public class RaiseToThePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int raisedToThePower = 1;
        while (number2 != 0) {
            raisedToThePower *= number1;
            --number2;
        }
        System.out.printf("Raised to the power = " +raisedToThePower);
    }
}