package chapterFive;
import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (count <= 5) {
            System.out.print("Enter a number between 1 and 30: ");
            int userInput = scanner.nextInt();
            if (userInput >= 1 && userInput <= 30) {
                for (int i = 1; i <= userInput; i++) {
                    System.out.print("*");
                }
                System.out.println();
                count++;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 30.");
            }
        }
    }
}
