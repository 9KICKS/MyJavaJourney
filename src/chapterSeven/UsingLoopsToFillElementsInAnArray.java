package chapterSeven;

import java.util.Arrays;

public class UsingLoopsToFillElementsInAnArray {
    public static void main(String[] args) {
        int[][] arrayLoop = new int[3][3];
        int counter = 1;
        for (int rows = 0; rows < arrayLoop.length; rows++) {
            for (int columns = 0; columns < arrayLoop[rows].length; columns++) {
                arrayLoop[rows][columns] = counter;
                counter++;
            }
        }
        for (int[] row:arrayLoop) {
            System.out.println(Arrays.toString(row));
        }
    }
}
