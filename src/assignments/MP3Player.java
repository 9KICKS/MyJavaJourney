package assignments;

import java.util.Scanner;

public class MP3Player {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        home();
    }

    private static void home() {
        System.out.println();
        System.out.println("    *     ***** ***** *     *****");
        System.out.println("   * *    *   * *   * *     *    ");
        System.out.println("  *****   ***** ***** *     *****");
        System.out.println(" *     *  *     *     *     *    ");
        System.out.println("*       * *     *     ***** *****");
        System.out.println("Hello, welcome to your iPod");
        System.out.println("""
                Home:
                1. iTunes
                2. Apple Music
                3. Settings
                4. Turn off
                """);
        System.out.println();
        System.out.println("Enter a number from Home: ");
        int home = input.nextInt();
        switch (home) {
            case 1 -> iTunes();
            case 2 -> appleMusic();
            case 3 -> settings();
            case 4 -> {
                System.out.println("Shutting down");
                System.exit(200);
            }
        }
    }

    private static void settings() {
        System.out.println();
        System.out.println("""
                Settings:
                1. Customize
                2. Bluetooth
                3. Audio settings
                4. Back
                """);
        System.out.println("Select a number: ");
        int settings = input.nextInt();
        switch (settings) {
            case 1 -> customize();
            case 2 -> System.out.println("Turn bluetooth on or off");
            case 3 -> audioSettings();
            case 4 -> home();
        }
        settings();
    }

    private static void customize() {
        System.out.println("""
                Customize:
                1. Change theme
                2. Add passcode
                3. Back
                """);
        System.out.println("Select a number: ");
        int customize = input.nextInt();
        switch (customize) {
            case 1:
                System.out.println("Change theme");
                System.out.println("Select light mode or dark mode");
            case 2:
                System.out.println("Choose a new passcode");
            case 3:
                settings();
        }
        System.out.println();
    }

    private static void audioSettings() {
        System.out.println("""
                Audio settings:
                1. Volume
                2. Back
                """);
        int audioSettings = input.nextInt();
        switch (audioSettings) {
            case 1 -> volume();
            case 2 -> settings();
        }
    }

    private static void volume() {
        System.out.println("<---Volume--->");
        audioSettings();
    }

    private static void appleMusic() {
        System.out.println();
        System.out.println("""
                Apple Music:
                1. Library
                2. For you
                3. Browse
                4. Radio
                5. Store
                6. Back
                """);
        System.out.println("Select a number: ");
        int appleMusic = input.nextInt();
        switch (appleMusic) {
            case 1 -> library();
            case 2 -> forYou();
            case 3 -> browse();
            case 4 -> radio();
            case 5 -> store();
            case 6 -> home();
        }
    }

    private static void store() {
        appleMusic();
    }

    private static void radio() {
        appleMusic();
    }

    private static void browse() {
        appleMusic();
    }

    private static void forYou() {appleMusic();}

    private static void library() {
        appleMusic();
    }

    private static void iTunes() {
        System.out.println();
        System.out.println("""
                iTunes:
                1. Buy your favourite music
                2. Top 100 charts
                3. Back
                """);
        System.out.println("Select a number: ");
        int iTunes = input.nextInt();
        switch (iTunes) {
            case 1 -> {
                System.out.println("Enter your account details: ");
                int accountNo = input.nextInt();
                System.out.println("Bought successfully with " +accountNo+ ", check your email");
                iTunes();
            }
            case 2 -> {
                System.out.println("""
                        Top 100 charts:
                        1. Top 100 Global
                        2. Top 100 Nigeria
                        3. Top 100 USA
                        4. Top 100 UK
                        5. Back
                        """);
                iTunes();
            }
            case 3 -> home();
        }
    }
}
