package chapterSix;

import java.security.SecureRandom;

public class ShiftedAndScaledRandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);
            System.out.print(face);

            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
