package bookKeeping;

import java.util.ArrayList;

public class Diary {
    private final String diaryName;
    private final ArrayList<Entry> entries;
    private int passcode;

    public Diary(String diaryName, int passcode) {
        this.diaryName = diaryName;
        entries = new ArrayList<>();
        this.passcode = passcode;
    }

    public void changePasscode(int passcode) {
        this.passcode = passcode;
    }
    public boolean validatePasscode(int passcode) {
        return this.passcode == passcode;
    }
    public Entry createEntry(String title, String body, int iD) {
        return new Entry(title, body, iD);
    }
    public void addEntry(Entry entry) {
        entries.add(entry);
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
    public void viewEntry() {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            System.out.println(entry.toString());
        }
    }
    public int countEntry() {
        return entries.size();
    }
    public boolean removeEntryByTitle(String entryTitle) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(entryTitle)) {
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }
    public boolean removeEntryByEntryId(int EntryId) {
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
    public String findEntryByTitle(String entryTitle) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(entryTitle)) {
                return entry.toString();
            }
        }
        return "Entry not found.";
    }
    public String findEntryByEntryId(int EntryId) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (EntryId - 1 == i) {
                return entry.toString();
            }
        }
        return "Entry not found.";
    }
}
