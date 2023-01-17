package leetcodeChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the elements of the array list: ");
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNextInt()) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            list.add(number);
        }
        System.out.println();
        System.out.print("Enter the element to delete: ");
        int element = input.nextInt();
        System.out.println();
        System.out.print("New array list ---> " );
        deleteElement(list, element);
        System.out.print(list);
    }

    private static void deleteElement(ArrayList<Integer> list, int element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                list.remove(i);
                i--;
            }
        }
    }
}