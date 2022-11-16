package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeAssignmentTestTwo {
    @Test
    public void testThatABikeCanBeTurnedOn() {
        BikeAssignmentTwo bike = new BikeAssignmentTwo();
        bike.setPowerOn();
        boolean bikeIsOn = bike.getPower();
        assertTrue(bikeIsOn);
    }

    @Test
    public void testThatABikeCanBeTurnedOff() {
        BikeAssignmentTwo bike = new BikeAssignmentTwo();
        bike.setPowerOff();
        boolean bikeIsOff = bike.getPower();
        assertFalse(bikeIsOff);
    }

    @Test
    public void testThatABikeCanBeAccelerated() {
        BikeAssignmentTwo bike = new BikeAssignmentTwo();
        bike.setPowerOn();
        bike.acceleration(1);
        int bikeSpeed = bike.getGearSpeed();
        assertEquals(1, bikeSpeed);

        bike.setGearSpeed(19);
        assertEquals(19, bike.getGearSpeed());
        bike.acceleration(1);
        assertEquals(20, bike.getGearSpeed());

        bike.setGearSpeed(25);
        bike.acceleration(2);
        assertEquals(27, bike.getGearSpeed());

        bike.setGearSpeed(31);
        bike.acceleration(3);
        assertEquals(34, bike.getGearSpeed());

        bike.setGearSpeed(70);
        bike.acceleration(4);
        assertEquals(74, bike.getGearSpeed());



    }
}
