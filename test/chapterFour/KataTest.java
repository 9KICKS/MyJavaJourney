package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {


    @Test
    public void squareTest() {
        Kata kata = new Kata();
        int result = kata.squareOf(5);
        assertEquals(25, result);
    }

    @Test
    public void addTest(){
        Kata kata = new Kata();
        int sum = Kata.add(12, 2);
        assertEquals(14, sum);
    }

    @Test
    public void maxTest(){
        Kata kata = new Kata();
        int maximum = Kata.maxOf(23, 12);
        assertEquals(23, maximum);
    }
}