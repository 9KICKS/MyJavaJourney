package selfStudy;

import java.util.Scanner;

public class DistanceBetweenCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current city name:");
        String currentCity = input.nextLine();
        System.out.println("Enter destination city name:");
        String destinationCity = input.nextLine();
        System.out.println("Enter " + currentCity + " Latitude:");
        double currentCityLatitude = input.nextDouble();
        System.out.println("Enter " + currentCity + " Longitude:");
        double currentCityLongitude = input.nextDouble();
        System.out.println("Enter " + destinationCity + " Latitude:");
        double destinationCityLatitude = input.nextDouble();
        System.out.println("Enter " + destinationCity + " Longitude:");
        double destinationCityLongitude = input.nextDouble();
        double r = 6371;
        double p = Math.PI / 180;
        double distance = (2 * r) * Math.asin(Math.sqrt(0.5 - Math.cos((currentCityLatitude - destinationCityLatitude) * p) / 2 + Math.cos(destinationCityLatitude * p) * Math.cos(currentCityLatitude * p) * (1 - Math.cos((currentCityLongitude - destinationCityLongitude) * p)) / 2));
        System.out.println("The distance between " + currentCity + " and " + destinationCity + " is " + distance + "km.");
    }
}