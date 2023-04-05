package selfStudy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PrimeFactorsTest {
    @Test public void testGeneratePrimeFactors() {
        int number = 100;
        int[] expected = {2, 2, 5, 5};
        int[] actual = PrimeFactors.generatePrimeFactors(number);
        assertArrayEquals(expected, actual                                                                                       );
    }
}
