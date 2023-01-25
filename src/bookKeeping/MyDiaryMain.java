package bookKeeping;

import java.util.Scanner;

public class MyDiaryMain {
    private static Diary diary;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp(){
        System.out.println("Enter your name:");
        String userName = input.nextLine();
        System.out.println("Create passcode:");
        int passcode = input.nextInt();
        diary = new Diary(userName, passcode);
        System.out.println("Welcome " + userName + ".");
        System.out.println("This is your safe place!");
        boolean quit = false;
        while(!quit){
            String prompt = """
                    =============================
                    Press:
                    * 1. --> Add new entry
                    * 2. --> Find entry
                    * 3. --> Remove entry
                    * 4. --> Update entry
                    * 5. --> View all entries
                    * 6. --> Count entries
                    * 7. --> Change passcode
                    * 8. --> Exit
                    =============================""";
            System.out.println(prompt);
            int response = input.nextInt();
            input.nextLine();
            switch (response) {
                case 1 -> addEntry();
                case 2 -> findEntry();
                case 3 -> removeEntry();
                case 4 -> updateEntry();
                case 5 -> viewAllEntries();
                case 6 -> countAllEntries();
                case 7 -> changePassword();
                case 8 -> {
                    System.out.println("Bye! Remember to pen down your thoughts tomorrow.");
                    quit = true;
                }
                default -> runApp();
            }
            System.out.println();
        }
    }

    private static void countAllEntries() {
        diary.countEntry();
    }
    private static void changePassword() {
        System.out.println("Enter old passcode:");
        int oldPasscode = input.nextInt();
        if (diary.validatePasscode(oldPasscode)) {
            System.out.println("Enter new passcode:");
            int newPasscode = input.nextInt();
            diary.changePasscode(newPasscode);
            System.out.println("Passcode successfully changed.");
        } else System.out.println("Incorrect passcode.");
    }
    private static void viewAllEntries() {
        diary.viewEntry();
    }
    private static void updateEntry() {
        System.out.println("Enter the title of the entry:");
        String oldTitle = input.nextLine();
        if (!diary.confirmEntry(oldTitle)) {
            System.out.println("Entry not found.");
        } else {
            System.out.println("Enter new title:");
            String newTitle = input.nextLine();
            System.out.println("Enter new body:");
            String newBody = input.nextLine();
            System.out.println("Enter new ID:");
            int newID = input.nextInt();
            Entry entry = diary.createEntry(newTitle, newBody, newID);
            if (diary.editEntry(oldTitle, entry)) {
                System.out.println("Entry successfully updated.");
            }
        }
    }
    private static void removeEntryByTitle() {
        System.out.println("Enter the title of the entry:");
        String title = input.nextLine();
        if(diary.removeEntryByTitle(title)){
            System.out.println("Entry with " + title + " as title successfully removed.");
        }
        else System.out.println("Entry not found.");
    }
    private static void removeEntryByEntryNumber() {
        System.out.println("Enter entry number:");
        int entryNumber = input.nextInt();
        if(diary.removeEntryByEntryId(entryNumber)){
            System.out.println("Entry with entry Number " + entryNumber + " as title successfully removed.");
        }
        else System.out.println("Entry not found.");
    }
    private static void findEntry() {
        System.out.println("""
                ================================
                How do you wish to find entry?
                * 1. -> By Title
                * 2. -> By Entry Number
                ================================""");
        int response = input.nextInt();
        switch (response) {
            case 1 -> findEntryByTitle();
            case 2 -> findEntryByEntryNumber();
            default -> runApp();
        }
    }
    private static void removeEntry() {
        System.out.println("""
                =================================
                How do you wish to remove entry?
                * 1. -> By ID
                * 2. -> By entry number
                =================================""");
        int response = input.nextInt();
        switch (response) {
            case 1 -> removeEntryByTitle();
            case 2 -> removeEntryByEntryNumber();
            default -> runApp();
        }
        input.nextLine();
    }
    private static void findEntryByEntryNumber() {
        System.out.println("Enter the entry ID:");
        int entryNumber = input.nextInt();
        input.nextLine();
        String result = diary.findEntryByEntryId(entryNumber);
        System.out.println(result);
    }
    private static void findEntryByTitle() {
        System.out.println("Enter the title of the entry:");
        String title = input.nextLine();
        String result = diary.findEntryByTitle(title);
        System.out.println(result);
    }
    private static void addEntry() {
        System.out.println("Enter the title of the entry:");
        String title = input.nextLine();
        System.out.println("Enter the body of the entry:");
        String body = input.nextLine();
        System.out.println("Enter the ID of the entry:");
        int iD = input.nextInt();
        Entry entry = diary.createEntry(title, body, iD);
        diary.addEntry(entry);
        System.out.println(title + " successfully added as new entry.");
    }
}