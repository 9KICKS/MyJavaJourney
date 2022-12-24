package chapterSix;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        if (primeNumber(userInput)) {
            System.out.println(userInput+ " is a prime number");
        } else {
            System.out.println(userInput+ " is not a prime number");
        }
    }

    public static boolean primeNumber(int userInput) {
        if (userInput <= 1) {
            return false;
        }
        for (int i = 2; i <= (userInput/2); i++) {
            if (userInput % i == 0) {
                return false;
            }
        }
        return true;

    //public static int primeNumber{
      //  int count = 0;
        //    for (int i = 1; i <= 10000; i++) {


            }
        }
  //  }
//}