package selfStudy;

import java.util.Scanner;

public class CelsiusTemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fahrenheit to convert to celsius: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 0.55;
        System.out.println("" + fahrenheit + "°F ---> celsius = " + celsius + "°C");
    }
}
