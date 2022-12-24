package chapterThree;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class CarClassTest {

    @Test
    public void testThatCarCanBeCreated() {
        CarClass benz = new CarClass("G-990", "2022", 50.00);
        assertNotNull(benz);
    }

    @Test
    public void testThatCarsAttributesAreProperlyInitialized() {
        CarClass benz = new CarClass("G-990", "2022", 50.00);
        assertEquals("G-990", benz.getModel());
        assertEquals("2022", benz.getYear());
        assertEquals(50.00, benz.getPrice());
    }

    @Test
    public void testThatOnlyPositiveAmountAreAllowedAsCarPrice() {
        CarClass benz = new CarClass("G-990", "2022", 50.00);
        benz.setPrice(-2000000.0);
        assertEquals(50.00, benz.getPrice());
    }

    @Test
    public void testDiscount() {
        CarClass benz = new CarClass("G-990", "2022", 50.00);
        benz.applyDiscount(10);

    }
}
