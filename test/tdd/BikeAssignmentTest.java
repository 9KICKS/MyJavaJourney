package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

    public class BikeAssignmentTest {
        @Test
        public void BikeCanBeCreated() {
            BikeAssignment folaBike = new BikeAssignment();
            assertNotNull(folaBike);
        }

        @Test
        public void isOn() {
            BikeAssignment folaBike = new BikeAssignment();
            folaBike.setSwitch();
            assertEquals(true, folaBike.isOn());
        }

        @Test
        public void BikeCanBeAccelerated() {
            BikeAssignment folaBike = new BikeAssignment();
            folaBike.setSwitch();
            folaBike.accelerate();
            assertEquals(1, folaBike.getSpeed());
        }

        @Test
        public void BikeCanBeChangedToGearOne() {
            BikeAssignment folaBike = new BikeAssignment();
            folaBike.setSwitch();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            assertEquals(16, folaBike.getSpeed());
        }
        @Test
        public void BikeCanChangeToGear2() {
            BikeAssignment folaBike = new BikeAssignment();
            folaBike.setSwitch();
            folaBike.Gear();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.accelerate();
//          folaBike.Gear();
            assertEquals(1, folaBike.getGear());
            assertEquals(26, folaBike.getSpeed());
        }

        @Test
        public void BikeCanChangeToGear3() {
            BikeAssignment folaBike = new BikeAssignment();
            folaBike.setSwitch();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.Gear();
            assertEquals(38, folaBike.getSpeed());
        }

        @Test
        public void BikeCanChangeToGear4() {
            BikeAssignment folaBike = new BikeAssignment();
            folaBike.setSwitch();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            folaBike.accelerate();
            assertEquals(48, folaBike.getSpeed());
        }
    }
