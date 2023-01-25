package leetcodeChallenges;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        String[] input = (new java.util.Scanner(System.in)).nextLine().split(" ");
        for (String num : input) {
            arr.add(Integer.parseInt(num));
        }
        System.out.println("All permutations are:");
        permute(arr, 0);
    }

    public static void permute(List<Integer> userArray, int number){
        for(int i = number; i < userArray.size(); i++){
            java.util.Collections.swap(userArray, i, number);
            permute(userArray, number + 1);
            java.util.Collections.swap(userArray, number, i);
        }
        if (number == userArray.size() - 1) {
            System.out.println(userArray);
        }
    }
}

