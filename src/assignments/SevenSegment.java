package assignments;

public class SevenSegment {
    static String[][] sevenSegmentDisplay = new String[5][4];

        public static void showA() {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j <= 3; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }

        public static void showB() {
            for (int i = 0; i <= 2; i++) {
                for (int j = 3; j <= 3; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }

        public static void showC() {
            for (int i = 2; i <= 4; i++) {
                for (int j = 3; j <= 3; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }

        public static void showD() {
            for (int i = 4; i <= 4; i++) {
                for (int j = 0; j <= 3; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }

        public static void showE() {
            for (int i = 2; i <= 4; i++) {
                for (int j = 0; j <= 0; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }
        public static void showF() {
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 0; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }
        public static void showG() {
            for (int i = 2; i <= 2; i++) {
                for (int j = 0; j <= 3; j++) {
                    sevenSegmentDisplay[i][j] = "#";
                }
            }
        }
        public static void screenDisplay(String input) {
            for (int i = 0; i <= 4; i++) {
                for (int j = 0; j <= 3; j++) {
                    sevenSegmentDisplay[i][j] = " ";
                }
            }
            if (input.charAt(7) == '1') {
                if (input.charAt(0) == '1') {
                    showA();
                }
                if (input.charAt(1) == '1') {
                    showB();
                }
                if (input.charAt(2) == '1') {
                    showC();
                }
                if (input.charAt(3) == '1') {
                    showD();
                }
                if (input.charAt(4) == '1') {
                    showE();
                }
                if (input.charAt(5) == '1') {
                    showF();
                }
                if (input.charAt(6) == '1') {
                    showG();
                }
            }
        }
        public  static void display() {
            for (int i = 0; i <= 4; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(sevenSegmentDisplay[i][j] + " ");
                }
                System.out.println();
            }
    }
}
