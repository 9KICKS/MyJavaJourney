package selfStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OutputOfTheNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in this format (dd/MM/yyyy): ");
        String userDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(userDate, formatter);
        LocalDate nextDay = date.plusDays(1);
        String nextDayFormatted = nextDay.format(formatter);
        System.out.println("The next day is " + nextDayFormatted);
    }
}