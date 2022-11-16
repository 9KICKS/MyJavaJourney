package chapterTwo;

import java.util.Scanner;
public class ComparingIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 100;

		System.out.print("Enter an integer: ");
		int integer = input.nextInt();


		int integerSquare = integer * integer;


		if (integerSquare > number) {
		System.out.printf("%d > %d%n", integerSquare, number);
		}

		if (integerSquare == number) {
		System.out.printf("%d == %d%n", integerSquare, number);
		}

		if (integerSquare != number) {
		System.out.printf("%d != %d%n", integerSquare, number);
		}

		if (integerSquare < number) {
		System.out.printf("%d < %d%n", integerSquare, number);
		}

	}

}