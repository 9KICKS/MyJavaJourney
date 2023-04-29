package selfStudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDigitsTest {
    @Test public void testThatMyMethodWorks() {
        assertEquals(10, FindTheDigits.findTheTotalDigits("-00AB13 96, Q2RBS, G381AC"));
    }
}