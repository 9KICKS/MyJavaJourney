package chapterFour;

import java.util.Scanner;

public class StudentsAverageWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentTotal = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.print("Enter your grade: ");
            int studentGrade = input.nextInt();
            studentTotal = studentTotal + studentGrade;
            counter += 1;
        }

            int average = studentTotal / (counter - 1);
            System.out.println("The average student grade is " + average);
    }
}