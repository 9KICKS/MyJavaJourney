package selfStudy;

import java.util.Arrays;

public class MinimumAndMaximumSummedIntegerInAnArray {
    public static void main(String[] args) {
        int[] userArray = {1, 2, 3, 8, 10, 4, 9, 11};
        int[] result = calculateMinimumAndMaximumAfterSumming(userArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] calculateMinimumAndMaximumAfterSumming(int[] userArray) {
        int[] sortedArray = Arrays.stream(userArray).sorted().toArray();
        int totalSum = Arrays.stream(sortedArray).sum();
        int minimumSum = totalSum - sortedArray[sortedArray.length - 1];
        int maximumSum = totalSum - sortedArray[0];
        return (minimumSum != maximumSum) ? new int[]{sortedArray[sortedArray.length - 1], sortedArray[0]} : new int[]{};
    }
}
