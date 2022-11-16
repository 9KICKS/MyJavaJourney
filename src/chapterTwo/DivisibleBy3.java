package chapterTwo;

import java.util.Scanner;

	public class DivisibleBy3 {

		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int number = input.nextInt();


		if(number % 3 == 0) {
			System.out.printf("Number is divisible by 3");
		}

		if(number % 3 != 0) {
			System.out.printf("Number is not divisible by 3");
		}

	}

}