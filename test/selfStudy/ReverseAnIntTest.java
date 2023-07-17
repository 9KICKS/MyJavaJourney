package selfStudy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseAnIntTest {
    @Test
    public void testReverseInt() {
        assertEquals("054321", ReverseAnInt.reverseInt(123450));
    }
}
