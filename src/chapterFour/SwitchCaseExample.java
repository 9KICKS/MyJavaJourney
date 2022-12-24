package chapterFour;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("""
            1. 2000
            2. 5000
            3. 10000
            4. 15000
            5. 20000
            6. Other amounts
            """);

    System.out.println("Enter amount to withdraw: ");
    int input = scanner.nextInt();
    switch (input) {
        case 1:
            System.out.println("Take your 2K");
            break;
        case 2:
            System.out.println("Take your 5K");
            break;
        case 3:
            System.out.println("Take your 10K");
            break;
        case 4:
            System.out.println("Take your 15K");
            break;
        case 5:
            System.out.println("Take your 20K");
            break;
        case 6:
            System.out.println("Enter amount: ");
            String amount = scanner.nextLine();

            otherOption(amount);

        }
    }

    public static void otherOption(String amount) {
        System.out.println("Take your" +amount);

    }

}
