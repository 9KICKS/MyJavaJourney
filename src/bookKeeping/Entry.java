package bookKeeping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private final int iD;
    String title;
    String body;
    private final LocalDateTime date = LocalDateTime.now();

    public Entry( int iD, String title, String body) {
        this.iD = iD;
        this.title = title;
        this.body = body;
    }

    public int getID() {
        return iD;
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

    @Override
    public String toString() {
        return String.format("""
                ⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛
                Date: %s
                ID: %s
                Title: %s
                Body: %s
                ⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛⚛
                """, getDate(), iD, title, body);
    }
}
