package chapterEight;


import java.util.Scanner;

public class GeoPoliticalZone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a state to know it's geo-political zone: ");
        String userState = input.nextLine();
        System.out.println("The geo-political zone of " + userState + " is " + Zone.getPoliticalZone(userState));
    }
}
