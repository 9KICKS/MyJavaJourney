package assignments;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println(" *****    ***  ************  ***      ***  ***********           **         ");
        System.out.println(" *******  ***  ***      ***  ***   ***         ***            **    **      ");
        System.out.println(" ***  *** ***  ***      ***  *****             ***          ************    ");
        System.out.println(" ***   ******  ***      ***  ***   ***         ***        ***          ***  ");
        System.out.println(" ***    *****  ************  ***      ***  ***********  ***             *** ");
        System.out.println("Hello, welcome to your Nokia phone");
        System.out.println("We have included visuals of the 14 menu functions and they are numbered 1 - 14 so you can select a number.");
        System.out.println("""
                Menu:
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim services
                14. Exit
                """);
        System.out.println();
        System.out.println("Enter a number to continue: ");
        int menu = input.nextInt();
        switch (menu) {
            case (1):
                System.out.println("""
                        Phone book:
                        1. Search
                        2. Service Nos
                        3. Add Name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        11. Back <--
                        """);
                System.out.println("Enter a number: ");
                int phoneBook = input.nextInt();
                switch (phoneBook) {
                    case (1) -> System.out.println("Search");
                    case (2) -> System.out.println("Service Nos");
                    case (3) -> System.out.println("Add name");
                    case (4) -> System.out.println("Erase");
                    case (5) -> System.out.println("Edit");
                    case (6) -> System.out.println("Assign tone");
                    case (7) -> System.out.println("Send b'card");
                    case (8) -> {
                        System.out.println("""
                                Options:
                                1. Type of view
                                2. Memory status
                                3. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int options = input.nextInt();
                        switch (options) {
                            case (1) -> System.out.println("Type of view");
                            case (2) -> System.out.println("Memory status");
                            default -> System.out.println("***Loading***");
                        }
                    }
                    case (9) -> System.out.println("Speed dials");
                    case (10) -> System.out.println("Voice dials");
                    default -> System.out.println("***Loading***");
                }
                break;
            case (2):
                System.out.println("""
                        Messages:
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        11. Back <--
                        """);
                System.out.println("Enter a number: ");
                int messages = input.nextInt();
                switch (messages) {
                    case (1) -> System.out.println("Write messages");
                    case (2) -> System.out.println("Inbox");
                    case (3) -> System.out.println("Outbox");
                    case (4) -> System.out.println("Picture messages");
                    case (5) -> System.out.println("Templates");
                    case (6) -> System.out.println("Smileys");
                    case (7) -> {
                        System.out.println("""
                                Message settings:
                                1. Set 1
                                2. Common
                                3. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int setOne = input.nextInt();
                        switch (setOne) {
                            case (1) -> {
                                System.out.println("""
                                        Set 1:
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message validity
                                        4. Back <--
                                        """);
                                System.out.println("Enter a number: ");
                                int setOptions = input.nextInt();
                                switch (setOptions) {
                                    case (1) -> System.out.println("Message centre number");
                                    case (2) -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case (2) -> {
                                System.out.println("""
                                        Common
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        4. Back <--
                                        """);
                                System.out.println("Enter a number: ");
                                int common = input.nextInt();
                                switch (common) {
                                    case (1) -> System.out.println("Delivery reports");
                                    case (2) -> System.out.println("Reply via same centre");
                                    case (3) -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                }
            case (3):
                System.out.println("Chat");
                break;
            case (4):
                System.out.println("""
                        Call register:
                        1. Missed calls
                        2. Received calls
                        3. Dialed numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                        9. Back <--
                        """);
                System.out.println("Enter a number: ");
                int callRegister = input.nextInt();
                switch (callRegister) {
                    case (1) -> System.out.println("Missed calls");
                    case (2) -> System.out.println("Received calls");
                    case (3) -> System.out.println("Dialled calls");
                    case (4) -> System.out.println("Erase recent call lists");
                    case (5) -> {
                        System.out.println("""
                                Show call duration:
                                1. Last call duration
                                2. All calls duration
                                3. Received calls duration
                                4. Dialled calls duration
                                5. Clear timer
                                6. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int callDuration = input.nextInt();
                        switch (callDuration) {
                            case (1) -> System.out.println("Last call duration");
                            case (2) -> System.out.println("All calls duration");
                            case (3) -> System.out.println("Received calls duration");
                            case (4) -> System.out.println("Dialled calls duration");
                            case (5) -> System.out.println("Clear timer");
                            default -> System.out.println("***Loading***");
                        }
                    }
                    case (6) -> {
                        System.out.println("""
                                Show call cost:
                                1. Last call cost
                                2. All calls cost
                                3. Clear counters
                                4. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int callCost = input.nextInt();
                        switch (callCost) {
                            case (1) -> System.out.println("Last call cost");
                            case (2) -> System.out.println("All calls cost");
                            case (3) -> System.out.println("Clear counters");
                        }
                    }
                    case (7) -> {
                        System.out.println("""
                                Call cost settings:
                                1. Call cost limit
                                2. Show costs in
                                3. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int callCostSettings = input.nextInt();
                        switch (callCostSettings) {
                            case (1) -> System.out.println("Call cost limit");
                            case (2) -> System.out.println("Show costs in");
                        }
                    }
                    case (8) -> System.out.println("Prepaid credit");
                }
                break;
            case (5):
                System.out.println("""
                        Tones:
                        1. Ringing Tone
                        2. Ringing Volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        10. Back <--
                        """);
                System.out.println("Enter a number: ");
                int tones = input.nextInt();
                switch (tones) {
                    case (1) -> System.out.println("Ringing Tone");
                    case (2) -> System.out.println("Ringing volume");
                    case (3) -> System.out.println("Incoming call alert");
                    case (4) -> System.out.println("Composer");
                    case (5) -> System.out.println("Message alert tone");
                    case (6) -> System.out.println("Keypad tones");
                    case (7) -> System.out.println("Warning and games tone");
                    case (8) -> System.out.println("Vibrating alert");
                    case (9) -> System.out.println("Screen saver");
                }
                break;
            case (6):
                System.out.println("""
                        Settings:
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        5. Back <--
                        """);
                System.out.println("Enter a number: ");
                int settings = input.nextInt();
                switch (settings) {
                    case (1) -> {
                        System.out.println("""
                                Call settings:
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                7. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int callSettings = input.nextInt();
                        switch (callSettings) {
                            case (1) -> System.out.println("Automatic redial");
                            case (2) -> System.out.println("Speed dialing");
                            case (3) -> System.out.println("Calling waiting options");
                            case (4) -> System.out.println("Own number sending");
                            case (5) -> System.out.println("Phone line in use");
                            case (6) -> System.out.println("Automatic answer");
                            default -> System.out.println("***Loading***");
                        }
                    }
                    case (2) -> {
                        System.out.println("""
                                Phone settings:
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm sim settings action
                                7. Back <--
                                """);
                        System.out.println("Enter a number: ");
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings) {
                            case (1) -> System.out.println("Language");
                            case (2) -> System.out.println("Cell info display");
                            case (3) -> System.out.println("Welcome note");
                            case (4) -> System.out.println("Network selection");
                            case (5) -> System.out.println("Lights");
                            case (6) -> System.out.println("Confirm sim settings action");
                            default -> System.out.println("***Loading***");
                        }
                    }
                    case (3) -> {
                        System.out.println("""
                                Security settings:
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialing
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                7. Back <---
                                """);
                        System.out.println("Enter a number: ");
                        int securitySettings = input.nextInt();
                        switch (securitySettings) {
                            case (1) -> System.out.println("PIN code request");
                            case (2) -> System.out.println("Call barring services");
                            case (3) -> System.out.println("Fixed dialing");
                            case (4) -> System.out.println("Closed user group");
                            case (5) -> System.out.println("Phone settings");
                            case (6) -> System.out.println("Change access codes");
                            default -> System.out.println("***Loading***");
                        }
                    }
                    case (4) -> System.out.println("Restore factory settings");
                    default -> System.out.println("Nokia formatted");
                }
                break;
            case (7):
                System.out.println("Call divert");
                break;
            case (8):
                System.out.println("""
                        Games:
                        1. Gunbound
                        2. MapleStory
                        3. Ragnarok
                        4. Club Penguin
                        5. 02Jam
                        6. Tetris
                        7. Back <--
                        """);
                System.out.println("Enter a number: ");
                int games = input.nextInt();
                switch (games) {
                    case (1) -> System.out.println("Gunbound");
                    case (2) -> System.out.println("MapleStory");
                    case (3) -> System.out.println("Ragnarok");
                    case (4) -> System.out.println("Club Penguin");
                    case (5) -> System.out.println("02Jam");
                    case (6) -> System.out.println("Tetris");
                    default -> System.out.println("***Loading***");
                }
                break;
            case (9):
                System.out.println("Calculator");
                break;
            case (10):
                System.out.println("Reminders");
                break;
            case (11):
                System.out.println("""
                        Clock:
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        7. Back <--
                        """);
                System.out.println("Enter a number: ");
                int clock = input.nextInt();
                switch (clock) {
                    case (1) -> System.out.println("Alarm clock");
                    case (2) -> System.out.println("Clock Settings");
                    case (3) -> System.out.println("Date setting");
                    case (4) -> System.out.println("Stopwatch");
                    case (5) -> System.out.println("Countdown timer");
                    case (6) -> System.out.println("Auto update of date and time");
                    default -> System.out.println("***Loading***");
                }
                break;
            case (12):
                System.out.println("Profiles");
                break;
            case (13):
                System.out.println("SIM services");
                break;
            case (14):
                System.out.println("Exit");
                break;
        }
    }
}