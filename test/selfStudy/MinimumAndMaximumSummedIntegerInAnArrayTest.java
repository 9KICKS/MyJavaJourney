package selfStudy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimumAndMaximumSummedIntegerInAnArrayTest {
    @Test
    void testCalculateMinimumAndMaximumAfterSumming() {
        int[] userArray = {1, 2, 3, 8, 10, 4, 9, 11};
        int[] expected = new int[]{11, 1};
        int[] result = MinimumAndMaximumSummedIntegerInAnArray.calculateMinimumAndMaximumAfterSumming(userArray);
        assertArrayEquals(expected, result);
    }
}
