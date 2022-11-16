package chapterTwo;

import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print(" Enter the first number: ");
	int number1 = input.nextInt();

	System.out.print(" Enter the second number: ");
	int number2 = input.nextInt();

	int square1 = number1 * number1;
	int square2 = number2 * number2;

	System.out.println(" square of first number = " +square1 );
	System.out.println(" square of second number = " +square2 );

	int sum = square1 + square2;
	int difference = square1 - square2;

	System.out.println("Sum of square of first number + sqaure of second number = " +sum );
	System.out.println("Difference of square of first number - square of second number = " +difference );

	}

}	
