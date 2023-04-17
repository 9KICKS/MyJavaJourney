package selfStudy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AllFridaysInAYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int userYear = scanner.nextInt();
        System.out.println("The fridays in " + userYear + " are: ");
        for (int i = 1; i <= 365; i++) {
            LocalDate date = LocalDate.ofYearDay(userYear, i);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            }
        }
    }
}