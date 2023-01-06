package selfStudy;

import java.util.Scanner;

public class MedianOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int userInput = input.nextInt();
        double [] array = new double[userInput];
        System.out.print("Enter " + userInput + " elements: ");
        double median;
        for(int i = 0; i < userInput; i++) {
            array[i] = input.nextDouble();
        }
        if(userInput % 2 == 1) {
            median = array[(userInput + 1) / 2-1];
        } else {
            median = (array[userInput / 2-1] + array[userInput / 2]) / 2;
        }
        System.out.println("The median is " + median);
    }
}
