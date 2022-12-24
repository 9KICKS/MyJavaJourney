package chapterSeven;

import java.util.Arrays;

public class MultiDimensionalArrayClassExercise {
    public static void main(String[] args) {
        int[][] classExercise = new int[3][];
        classExercise[0] = new int [3];
        classExercise[1] = new int [3];
        classExercise[2] = new int [3];

        classExercise[0][0] = 1;
        classExercise[0][1] = 2;
        classExercise[0][2] = 3;

        classExercise[1][0] = 4;
        classExercise[1][1] = 5;
        classExercise[1][2] = 6;

        classExercise[2][0] = 7;
        classExercise[2][1] = 8;
        classExercise[2][2] = 9;

        for (int[] row:classExercise) {
            System.out.println(Arrays.toString(row));
        }
    }
}
