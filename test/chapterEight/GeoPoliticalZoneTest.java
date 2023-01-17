package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneTest {

    @Test
    public void testGeoPoliticalZone() {
        GeoPoliticalZone geoPoliticalZone = new GeoPoliticalZone();
        String expectedNorthCentral = "NORTH_CENTRAL";
        String actualNorthCentral = String.valueOf(Zone.getPoliticalZone("Niger"));
        assertEquals(expectedNorthCentral, actualNorthCentral);
    }
}