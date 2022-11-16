package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerUTMETest {

    @Test
    public void copiesTest() {
        TestDrillerUTME input = new TestDrillerUTME();
        int copies = TestDrillerUTME.copies(78);
        assertEquals(101400, copies);
    }
}