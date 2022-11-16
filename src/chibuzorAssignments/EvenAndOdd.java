package chibuzorAssignments;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenNumbersCounter = 0;
        int oddNumbersCounter = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int c = 0;

        System.out.println("Enter a number, enter any negative number to exit: ");
        int userInput = input.nextInt();

        while (userInput > 0){
            System.out.println("Enter a number, enter any negative number to exit: ");
            userInput = input.nextInt();
            c++;
            if(userInput % 2 == 0){
                sumOfEvenNumbers += userInput;
                evenNumbersCounter++;
            }else {
                sumOfOddNumbers += userInput;
                oddNumbersCounter++;
            }
        }
        System.out.println("count of number entered is: "+ c);
        System.out.println("number of odd numbers entered "+oddNumbersCounter);
        System.out.println("number of even numbers entered "+evenNumbersCounter);
        System.out.println("sum of even numbers is: "+ sumOfEvenNumbers);
        System.out.println("sum of odd numbers is: "+ sumOfOddNumbers);
    }
}
