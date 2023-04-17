package selfStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertToStringDayOfTheWeek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date in this format (dd/MM/yyyy): ");
        String userDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(userDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("%s %d %s, %d", date.getDayOfWeek(), date.getDayOfMonth(), date.getMonth(), date.getYear());
    }
}