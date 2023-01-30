package bookKeeping;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.util.Collections;

public class MyDiaryMain {
    private static Diary diary;

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp(){
        customizedJOptionPane(new ColorUIResource(255, 255, 255));
        customizedJOptionPane(new ColorUIResource(0, 128, 128));
        customizedJOptionPane(new ColorUIResource(255, 255, 255));
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Create password:");
        JOptionPane.showMessageDialog(null, hidePassword(password));
        savingLogin();
        diary = new Diary(username, password);
        diary.unlockDiary(password);
        JOptionPane.showMessageDialog(null, "Welcome " + username + " , this is your safe place.");
        int userChoice;
        while (true) {
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    """
                            =*=*=*=*=*=*=*=*=*=*=*=*=
                            Welcome to your Diary:
                            1. Create Entry
                            2. Add Entry
                            3. View Entry
                            4. Update Entry
                            5. Delete Entry
                            6. Change Password
                            7. Lock Diary
                            8. Unlock Diary
                            9. Exit Diary
                            =*=*=*=*=*=*=*=*=*=*=*=*=
                            
                            REPLY (1-9):
                            """
            ));
            switch (userChoice) {
                case 1 -> createEntry();
                case 2 -> addEntry();
                case 3 -> viewEntry();
                case 4 -> updateEntry();
                case 5 -> deleteEntry();
                case 6 -> changePassword();
                case 7 -> lockDiary();
                case 8 -> unlockDiary();
                case 9 -> {
                    JOptionPane.showMessageDialog(null, "Bye! Remember to pen down your thoughts tomorrow.");
                    System.exit(1);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid choice. Try again.");
                    runApp();
                }
            }
        }
    }

    private static void savingLogin() {
        JOptionPane.showMessageDialog(null, "Saving your details...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Details saved successfully.");
    }

    private static void deleteEntry() {
        int entryNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter entry number:"));
        if(diary.deleteEntry(entryNumber)){
            JOptionPane.showMessageDialog(null, "Entry with entry Number " + entryNumber + " as title successfully deleted.");
        }
        else JOptionPane.showMessageDialog(null, "Entry not found.");
    }

    private static void changePassword() {
        String oldPassword = JOptionPane.showInputDialog(null, "Enter old password: ");
        if (diary.validatePassword(oldPassword)) {
            String newPassword = JOptionPane.showInputDialog(null, "Enter new password: ");
            diary.changePassword(newPassword);
            JOptionPane.showMessageDialog(null, "Password successfully changed.");
        } else JOptionPane.showMessageDialog(null, "Incorrect password.");
    }

    private static void unlockDiary() {
        if (diary != null) {
            String password = JOptionPane.showInputDialog(null, "Enter password: ");
            if (diary.unlockDiary(password)) {
                JOptionPane.showMessageDialog(null, "Diary unlocked successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password. Try again.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found. Create diary first.");
        }
    }

    private static void lockDiary() {
        if (diary != null) {
            diary.lockDiary();
            JOptionPane.showMessageDialog(null, "Diary locked successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found. Create diary first.");
        }
    }

    private static void updateEntry() {
        String oldTitle = JOptionPane.showInputDialog("Enter the title:");
        if (!diary.confirmEntry(oldTitle)) {
            JOptionPane.showMessageDialog(null, "Entry not found.");
        } else {
            String newTitle = JOptionPane.showInputDialog("Enter new title:");
            String newBody = JOptionPane.showInputDialog("Enter new body: ");
            Entry entry = diary.createEntry(newTitle, newBody);
            if (diary.editEntry(oldTitle, entry)) {
                JOptionPane.showMessageDialog(null, "Entry successfully updated.");
            }
        }
    }

    private static void viewEntry() {
        diary.viewEntry();
    }

    private static void createEntry() {
        if (!diary.isLocked()) {
            String title = JOptionPane.showInputDialog(null, "Enter title: ");
            String body = JOptionPane.showInputDialog(null, "Enter body: ");
            diary.createEntry(title, body);
            JOptionPane.showMessageDialog(null, "Entry created successfully.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Diary is locked.");
        }
    }

    private static void addEntry() {
        if (!diary.isLocked()) {
            String title = JOptionPane.showInputDialog(null, "Enter title: ");
            String body = JOptionPane.showInputDialog(null, "Enter body: ");
            Entry entry = diary.createEntry(title, body);
            diary.addEntry(entry);
            JOptionPane.showMessageDialog(null, title + " successfully added as new entry.");
        }
    }

    public static String hidePassword(String userInput) {
        int lastFour = Math.min(userInput.length(), 4);
        String maskCode = String.join("", Collections.nCopies(userInput.length() - lastFour, "*"));
        return maskCode + userInput.substring(userInput.length() - lastFour);
    }

    public static void customizedJOptionPane(ColorUIResource colorUIResource) {
        UIManager.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.background", new ColorUIResource(0, 128, 128));
        UIManager.put("Panel.other background", new ColorUIResource(255, 255, 255));
    }
}