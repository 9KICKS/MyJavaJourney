package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		System.out.print("Enter third integer: ");
		int number3 = input.nextInt();

		int sum = number1 + number2 + number3;
		System.out.println("sum is: " + sum);

		int average = sum / 3;
		System.out.println("average is: " + average);

		int product = number1 * number2 * number3;
		System.out.println("product is: " + product);

		if (number1 < number2 && number2 < number3) {
			System.out.println("smallest: " + number2);
		}
		if (number3 < number1 && number1 < number2) {
			System.out.println("smallest: " + number3);
		}
		if (number2 < number3 && number3 < number1) {
			System.out.println("smallest: " + number2);
		}
		if (number1 > number2 && number2 > number3) {
			System.out.println("largest: " + number1);
		}
		if (number2 > number3 && number3 > number1) {
			System.out.println("largest: " + number2);
		}
		if (number3 > number2 && number2 > number1) {
			System.out.println("largest: " + number3);

		}
	}
}