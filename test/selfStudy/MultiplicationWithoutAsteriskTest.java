package selfStudy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationWithoutAsteriskTest {
    @Test
    public void testMultiply() {
        assertEquals(25, MultiplicationWithoutAsterisk.multiply(5, 5));
        assertEquals(4, MultiplicationWithoutAsterisk.multiply(2, 2));
        assertEquals(-15, MultiplicationWithoutAsterisk.multiply(3, -5));
    }
}
