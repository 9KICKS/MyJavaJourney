package selfStudy;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateUserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate in this format (dd/MM/yyyy): ");
        String userBirthdate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthdate = LocalDate.parse(userBirthdate, formatter);
        LocalDate today = LocalDate.now();
        int age = Period.between(birthdate, today).getYears();
        System.out.println("You are " + age + " years old.");
    }
}