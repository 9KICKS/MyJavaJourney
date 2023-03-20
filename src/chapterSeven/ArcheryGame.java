package chapterSeven;

import java.security.SecureRandom;

public class ArcheryGame {

    public static void main(String[] args) {
        int[][] scores = new int[4][3];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(11);
            }
        }

        System.out.println("Player     Try 1     Try 2        Try 3           Total");
        for (int i = 0; i < 4; i++) {
            int total = 0;
            System.out.print(i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%12d", scores[i][j]);
                total += scores[i][j];
            }
            System.out.printf("%17d", total);
            System.out.println();
        }

        int gameWinner = 0;
        int highestScore = 0;

        for (int i = 0; i < 4; i++) {
            int playerScore = scores[i][0] + scores[i][1] + scores[i][2];
            if (playerScore > highestScore) {
                highestScore = playerScore;
                gameWinner = i;
            }
        }
        collatingScores();
        System.out.println("Player " + (gameWinner + 1) + " wins with a total score of " + highestScore + ".");
    }

    private static void collatingScores() {
        System.out.println();
        System.out.print("Collating Scores ");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(200);
            }
            System.out.println();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}