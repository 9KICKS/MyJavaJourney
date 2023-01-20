package selfStudy;

import java.util.Scanner;

public class WeightOnMars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight on Earth (lb):");
        double earthWeight = input.nextDouble();
        double marsWeight = earthWeight * 0.38;
        System.out.println("Your weight on Mars is " +marsWeight);
    }
}
