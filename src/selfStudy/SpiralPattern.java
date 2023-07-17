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
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }
            endColumn--;

            if (startRow <= endRow) {
                for (int i = endColumn; i >= startColumn; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }

            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startColumn] + " ");
                }
                startColumn++;
            }
        }
    }
}
