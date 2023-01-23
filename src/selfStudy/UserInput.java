package selfStudy;

import java.util.Scanner;

public class UserInput{
    public static void main(String[]args) {
      Scanner input = new Scanner(System.in);
 	  System.out.print("Enter a name: ");
	  String name = input.nextLine();
      System.out.println("Thank You " + name + " for entering our name.");
    }
}