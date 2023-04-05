package Pizza;

public class PizzaCalculator {
    public static void main(String[] args) {
        int people = 45;
        int numberOfMinimumSatisfaction = 2;
        int numberOfMaximumSatisfaction = 3;
        AboutPizza aboutPizza = calculatePizzaSlices(people, numberOfMinimumSatisfaction, numberOfMaximumSatisfaction);
        System.out.println("Number of pizza's gotten: " + aboutPizza.getNumberOfBoxes());
        System.out.println("Number of eaten pizza slices: " + aboutPizza.getEatenSlices());
        System.out.println("Number of leftover pizza slices: " + aboutPizza.getLeftOvers());
    }

    public static AboutPizza calculatePizzaSlices(int people, int numberOfMinimumSatisfaction, int numberOfMaximumSatisfaction) {
        int numberOfBoxes = (int) Math.ceil((double) people * numberOfMaximumSatisfaction / 8);
        int numberOfSlices = numberOfBoxes * 8;
        int numberOfMinimumSlices = numberOfMinimumSatisfaction * people;
        int numberOfMaximumSlices = numberOfMaximumSatisfaction * people;
        int numberOfLeftOverSlices = numberOfSlices - numberOfMaximumSlices;
        if (numberOfLeftOverSlices < 0) {
            numberOfLeftOverSlices = 0;
        }
        int numberOfEatenSlices = numberOfMaximumSlices;
        if (numberOfEatenSlices < numberOfMinimumSlices) {
            numberOfEatenSlices = numberOfMinimumSlices;
        }
        return new AboutPizza(numberOfBoxes, numberOfEatenSlices, numberOfLeftOverSlices);
    }
}