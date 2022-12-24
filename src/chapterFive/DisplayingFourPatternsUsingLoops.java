package chapterFive;

public class DisplayingFourPatternsUsingLoops {
    public static void main(String[] args) {
        System.out.println("Pattern A:");
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern B:");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern C:");
        int blank = 6;
        for (int i = 1 ; i <= blank; i++) {
            for (int j = 1; j <= blank - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }

        System.out.println();

        System.out.println("Pattern D:");
        int blank2 = 6;
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= blank2 - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}




