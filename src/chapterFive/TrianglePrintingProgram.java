package chapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        System.out.println("a:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("b:");
        for (int i = 0; i <= 10; i++) {
           for (int j = 10; j > i; j--) {
               System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("c:");
        int blank = 10;
        for (int i = 0; i < blank; i++) {
            for (int j = 0; j < blank - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("d:");
        int blank2 = 10;
        for (int i = 1; i <= blank2; i++) {
            for (int j = 1; j <= blank2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}