package selfStudy;

import java.util.Arrays;

public class PopulateTicTacToe {
    public static void main(String[] args) {
        int[][] userBoard = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};
        char[][] tictactoeBoard = populateBoard(userBoard);
        System.out.println(Arrays.deepToString(userBoard));
        System.out.println(Arrays.deepToString(tictactoeBoard));
    }

    private static char[][] populateBoard(int[][] userInput) {
        char[][] board = new char[3][3];
        for (int i = 0; i < userInput.length; i++) {
            for (int j = 0; j < userInput[i].length; j++) {
                if (userInput[i][j] == 1) {
                    board[i][j] = 'X';
                } else {
                    board[i][j] = 'O';
                }
            }
        }
        return board;
    }
}