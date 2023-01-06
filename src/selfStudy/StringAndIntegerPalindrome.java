package selfStudy;

import java.util.Scanner;

public class StringAndIntegerPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string/number to check if it's a palindrome: ");
		String string = input.nextLine();
		String stringReverse = "";
		int stringLength = string.length();
		for(int i = stringLength - 1; i >= 0; i--)
			stringReverse = stringReverse + string.charAt(i);
		if (string.equals(stringReverse)) {
			System.out.println("Your input is a palindrome.");
		} else {
			System.out.println("Your input is not a palindrome.");
		}
	}
}
