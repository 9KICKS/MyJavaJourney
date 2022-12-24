package selfStudy;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a first number:" );
	double firstNumber = input.nextDouble();
	System.out.println("Enter a second number:" );
	double secondNumber = input.nextDouble();
	double sum = firstNumber * secondNumber;
	double subtract = firstNumber - secondNumber;
	double divide = firstNumber / secondNumber;
	double multiply = firstNumber * secondNumber;
	double maximum = Math.max(firstNumber, secondNumber);
	double minimum = Math.min(firstNumber, secondNumber);
		System.out.println("The addition = " +sum);
		System.out.println("The subtraction = " +subtract);
		System.out.println("The division = " +divide);
		System.out.println("The multiplication = " +multiply);
		System.out.println("The maximum = " +maximum);
		System.out.println("The minimum = " +minimum);
	}
}