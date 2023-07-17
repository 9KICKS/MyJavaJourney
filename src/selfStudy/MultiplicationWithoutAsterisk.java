package selfStudy;

import java.util.Scanner;

public class MultiplicationWithoutAsterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstInput = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondInput = scanner.nextInt();
        int result = multiply(firstInput, secondInput);
        System.out.println(firstInput + " multiplied by " + secondInput + " = " + result);
    }

    public static int multiply(int firstInput, int secondInput) {
        int result = 0;
        if (secondInput < 0) {
            firstInput = -firstInput;
            secondInput = -secondInput;
        }
        for (int i = 0; i < secondInput; i++) {
            result += firstInput;
        }
        return result;
    }
}
