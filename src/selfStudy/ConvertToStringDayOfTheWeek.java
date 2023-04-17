package selfStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertToStringDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date in dd/MM/yyyy format: ");
        String userDate = scanner.nextLine();
        System.out.println(convertDate(userDate));
    }

    private static String convertDate(String userDate) {
        LocalDate date = LocalDate.parse(userDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String dayOfTheWeek = String.valueOf(date.getDayOfWeek());
        int dayOfTheMonth = date.getDayOfMonth();
        String month = String.valueOf(date.getMonth());
        int year = date.getYear();
        return String.format("%s %d %s, %d", dayOfTheWeek,dayOfTheMonth, month, year);
    }
}