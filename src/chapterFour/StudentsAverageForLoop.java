package chapterFour;

import java.util.Scanner;

public class StudentsAverageForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int sum = 0;
            int counter = 1;
            for (counter = 1; counter <= 10; counter++) {
                System.out.print("Enter your grade: ");
                int studentGrade = input.nextInt();
                sum = sum + studentGrade;
            }
            int average = sum / 10;
        System.out.println("The average student grade is: " +average);
    }
}
