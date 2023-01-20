package selfStudy;

import java.util.Scanner;

public class FahrenheitTemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter celsius to convert to fahrenheit: ");
        double celsius = input.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println("" + celsius + "°C ---> fahrenheit = " + fahrenheit + "°F");
    }
}
