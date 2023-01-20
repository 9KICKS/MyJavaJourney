package selfStudy;

import java.util.Scanner;

public class TotalNumberOfCharactersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String userString = input.nextLine();
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if(userString.charAt(i) != ' ');
            count++;
        }
        System.out.println("The total amount of characters in the sentence is " + count);
    }
}
