package chapterFour;

import java.util.Scanner;

public class FootballSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1-11: ");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("You are a goalkeeper");
                break;
            case 2:
                System.out.println("You are a left-back");
                break;
            case 3:
                System.out.println("You are a right-back");
                break;
            case 4:
                System.out.println("You are a centre-back");
                break;
            case 5:
                System.out.println("You are a centre-back");
                break;
            case 6:
                System.out.println("You are a defensive-midfielder");
                break;
            case 7:
                System.out.println("You are a left-winger");
                break;
            case 8:
                System.out.println("You are a central-midfielder");
                break;
            case 9:
                System.out.println("You are a centre-forward");
                break;
            case 10:
                System.out.println("You are an attacking-midfielder");
                break;
            case 11:
                System.out.println("You are a right-winger");
                break;
            default:
                System.out.println("You no sabi ball, smh!");
        }
    }
}
