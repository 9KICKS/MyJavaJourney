package selfStudy;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a first number:" );
		int firstNumber = input.nextInt();

	System.out.println("Enter a second number:" );
		int secondNumber = input.nextInt();

		int sum = (firstNumber + secondNumber);
		
		int subtract = (firstNumber - secondNumber);
		
		int multiply = (firstNumber * secondNumber);
		
		int divide = (firstNumber / secondNumber);
		
	
		System.out.printf("The sum is: %d%n", sum);
		System.out.printf("The difference is: %d%n", subtract);
		System.out.printf("The product is: %d%n", multiply);
		System.out.printf("The divide is: %d%n", divide);
	
	}

}