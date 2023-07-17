package selfStudy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSequenceTest {
    @Test
    public void testFibonacciSeries() {
        assertArrayEquals(new int[] {0, 1, 1, 2, 3}, FibonacciSequence.fibonacciSeries(5));
    }
}
