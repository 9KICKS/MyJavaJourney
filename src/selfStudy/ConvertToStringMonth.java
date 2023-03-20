package selfStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertToStringMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String userDate = input.nextLine();
        String convertedDate = convertDate(userDate);
        System.out.println(convertedDate);
    }

    private static final String[] MONTH = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public static String convertDate(String userDate) {
        LocalDate date = LocalDate.parse(userDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int dayOfMonth = date.getDayOfMonth();
        String monthName = MONTH[date.getMonthValue()];
        int year = date.getYear();
        return String.format("%d %s, %d", dayOfMonth, monthName, year);
    }
}