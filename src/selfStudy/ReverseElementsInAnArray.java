package selfStudy;

import java.util.Arrays;

public class ReverseElementsInAnArray {
    public static void main(String[] args) {
        int[] number = {5, 4, 3, 2, 1};
        reverse(number);
        System.out.println("Result = " + Arrays.toString(number));
    }

    private static void reverse(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
    }
}