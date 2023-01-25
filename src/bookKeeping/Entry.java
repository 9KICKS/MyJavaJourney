package bookKeeping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private final String title;
    private final String body;
    private final LocalDateTime date = LocalDateTime.now();
    private final int iD;

    public Entry(String title, String body, int iD) {
        this.title = title;
        this.body = body;
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyy, hh:mma");
        return dateTimeFormatter.format(date);
    }

    public int getID() {
        return iD;
    }

    @Override
    public String toString() {
        return String.format("""
                *************************
                Welcome to 9KICKS Diary:
                Date: %s
                ID: %s
                Title: %s
                Body: %s
                *************************
                """, getDate(), getID(), getTitle(), getBody());
    }
}
