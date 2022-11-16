package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	  System.out.print("Enter an integer: ");
        int integer = input.nextInt();

	  int radius = input.nextInt();

        int diameter = 2 * radius;
        double circumference = diameter * 3.14;
        double area = 3.14 * radius * radius;

        System.out.printf(" The Diameter is %d%n ", diameter);
        System.out.printf(" The Circumference is %.2f%n ", circumference);
        System.out.printf(" The Area is %.2f%n", area);

    }
}