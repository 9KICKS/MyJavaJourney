package chapterSix;

public class RecursionSample {
    public static void main(String[] args) {
        printRightAngledTriangle(6);
        printleftAngledTriangle(6);
    }

    private static void printleftAngledTriangle(int asterisk) {
        int spacing = asterisk;
        if (asterisk < 1) {
            return;
        }
        asterisk = asterisk - 1;
        printleftAngledTriangle(asterisk);
        for (int i = asterisk; i < 5; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < asterisk; i++) {
            System.out.print("*");
            }
        System.out.println();
        }

    private static void printRightAngledTriangle(int asterisk) {
        if (asterisk < 1) {
            return;
        }
        asterisk = asterisk - 1;
        printRightAngledTriangle(asterisk);
        for (int i = 0; i < asterisk; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// The method takes the asterisk and eventually produce 5 stars
// In recursion, you need to specify that you need to stop
// The method calls itself over and over again
// It prints "*" for everytime it calls the method
// asterisk isn't < 1, so it doesn't return, so it calls the method without printing anything for now
// It prints the asterisk from 0
// It runs with P0 - P6, the moment it calls P0, it begins to execute
// The P at the top of the method call stack finishes his job first
// return; allows the JVM to call execution
// P0 doesn't do any looping because it satisfies the (asterisk < 1) condition