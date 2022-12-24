package chapterSeven;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3},{4,5},{7},{10,11,12}};
// Static initialization is used when the length of the arrays are specified
        System.out.println(Arrays.deepToString(numbers));

        System.out.println();

        for (int[] row:numbers) {
            System.out.println(Arrays.toString(row));
        }
// This shows the arrays in rows

        System.out.println();

        int[][] number = new int[5][];
// The first [] means row while the second [] means columns
        number[0] = new int [4];
        number[1] = new int [5];
        number[2] = new int [6];

        number[0][0] = 14;
        number[0][3] = 20;

        number[2][0] = 34;
        number[2][4] = 44;

        System.out.println(Arrays.deepToString(number));

        System.out.println();
    }
}
