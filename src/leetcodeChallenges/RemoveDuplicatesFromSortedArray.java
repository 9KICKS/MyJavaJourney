package leetcodeChallenges;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int arrayLength = input.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = input.nextInt();
        }
        int length = removeDuplicates(numbers);
        System.out.println("The new length of the array without duplicates is: " + length);
        System.out.print("The array without duplicates is: [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] != numbers[i]) {
                i++;
                numbers[i] = numbers[j];
            }
        }
        return i + 1;
    }
}