package bookKeeping;

import javax.swing.*;
import java.util.ArrayList;

public class Diary {
    private String userName;
    private String password;
    ArrayList<Entry> entries;
    private boolean isLocked;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = true;
        entries = new ArrayList<>();
    }

    public String changePassword(String newPassword) {
        if (!isLocked) {
            this.password = newPassword;
            return "Password changed successfully";
        }
        return "Diary is locked. Cannot change password.";
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public Entry createEntry(String title, String body) {
        if (!isLocked) {
            addEntry(new Entry(entries.size() + 1, title, body));
        }
        return null;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public void viewEntry() {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            JOptionPane.showMessageDialog(null, entry.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void updateEntry(int id, String title, String body) {
        if (!isLocked) {
            Entry entry = findEntryByID(id);
            if (entry != null) {
                entry.title = title;
                entry.body = body;
            }
        }
    }

    public Entry findEntryByID(int id) {
        for (Entry entry : entries) {
            if (entry.getID() == id) {
                return entry;
            }
        }
        return null;
    }

    public boolean deleteEntry(int EntryId) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (EntryId - 1 == i) {
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }

    public boolean editEntry(String title, Entry newEntry) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (title.equals(entry.getTitle())) {
                entries.set(i, newEntry);
                return true;
            }
        }
        return false;
    }

    public boolean confirmEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (title.equals(entry.getTitle())) {
                return true;
            }
        }
        return false;

    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public boolean unlockDiary(String password) {
        if (validatePassword(password)) {
            this.isLocked = false;
        }
        return false;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
