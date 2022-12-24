package chapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating point values seperated by spaces: ");
        double firstUserInput = input.nextDouble();
        double secondUserInput = input.nextDouble();
        double thirdUserInput = input.nextDouble();

        double result = maximum(firstUserInput, secondUserInput, thirdUserInput);
        System.out.println("The maximum number is " +result);
    }

    private static double maximum(double first, double second, double third) {
        double maximumValue = first;
        if (second > maximumValue) {
            maximumValue = second;
        }
        if (third > maximumValue) {
            maximumValue = third;
        }
        return maximumValue;
    }
}
