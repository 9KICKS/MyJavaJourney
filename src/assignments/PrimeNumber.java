package assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                counter++;
            }
        }

        if(counter <= 2){
            System.out.println("it is a prime number");
        }
        else
            System.out.println("it is not a prime number");
    }
}
