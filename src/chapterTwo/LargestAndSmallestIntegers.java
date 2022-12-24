package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
	public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");    
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        int largest;
        int smallest;

        smallest = number1;        
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number4 < smallest)
            smallest = number4;
        if (number5 < smallest)
            smallest = number5;

        largest = number1;    
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;

        System.out.println("Smallest integer is " +smallest);
        System.out.println("Largest integer is " +largest);
    }
}