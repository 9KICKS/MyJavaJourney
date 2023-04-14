package semicolonAssessment.level2;

import java.util.Scanner;

public class FirstNonRepeatingIntegerInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array of numbers: ");
        int[] userArray = new int[]{scanner.nextInt()};
        int result = findFirstUnique(userArray);
        System.out.println(result);
    }

    public static int findFirstUnique(int[] array) {
        int[] frequentArray = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            frequentArray[number]++;
        }
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (frequentArray[number] == 1) {
                return number;
            }
        }
        return - 1;
    }
}