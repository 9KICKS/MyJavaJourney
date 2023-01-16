package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void testTimeConstructor(){
        Time time = new Time(22,34,12);
        assertThrows(IllegalArgumentException.class, ()->new Time(22,34,12));
// It takes in two arguments, the first of type class, the second of type executable
// .class returns the class
    }
}