package selfStudy;

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value++;
            }
        }

        int startRow = 0;
        int endRow = rows - 1;
        int startColumn = 0;
        int endColumn = columns - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.println(matrix[startRow][i] + " ");
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                System.out.println(matrix[i][endColumn] + " ");
            }
            endColumn--;

            if (startRow <= endRow) {
                for (int i = endColumn; i >= startColumn; i--) {
                    System.out.println(matrix[endRow][i] + " ");
                }
                endRow--;
            }

            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.println(matrix[i][startColumn] + " ");
                }
                startColumn++;
            }
        }
    }
}
