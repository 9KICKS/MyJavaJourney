package Pizza;

import java.util.Scanner;

public class PizzaCalculator {
    private final int minimumSatisfaction = 2;
    private final int maximumSatisfaction = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PizzaCalculator calculator = new PizzaCalculator();
        System.out.print("Enter the number of people that wants to eat the pizza: ");
        int people = input.nextInt();
        System.out.print("Enter the number of people that wants minimum satisfaction: ");
        int minimum = input.nextInt();
        System.out.print("Enter the number of people that wants maximum satisfaction: ");
        int maximum = input.nextInt();

        int minimumSlices = minimum * calculator.minimumSatisfaction;
        int maximumSlices = maximum * calculator.maximumSatisfaction;
        int totalSlices = people - minimum - maximum + minimumSlices + maximumSlices;

        AboutPizza pizza = new AboutPizza();
        pizza.numberOfBoxes = (int) Math.ceil(totalSlices / 8.0);
        pizza.eatenSlices = totalSlices;
        pizza.leftOvers = pizza.numberOfBoxes * 8 - totalSlices;

        System.out.println("Number of boxes needed: " + pizza.numberOfBoxes);
        System.out.println("Number of pizza slices eaten: " + pizza.eatenSlices);
        System.out.println("Number of left overs: " + pizza.leftOvers);
    }
}