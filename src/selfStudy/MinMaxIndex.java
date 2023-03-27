package selfStudy;

import java.util.ArrayList;
import java.util.List;

public class MinMaxIndex {
    public static void main(String[] args) {
        int[] userArray = {5,9,12,12};
        List<Integer> result = findMinMaxIndices(userArray);
        System.out.println("Indices of maximum and minimum: " + result);
    }

    public static List<Integer> findMinMaxIndices(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(minIndex);
        result.add(maxIndex);
        return result;
    }
}