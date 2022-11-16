package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirConditionerTest {

    @Test
    public void AcIsCreated() {
        AirConditioner folaAC = new AirConditioner();
        assertNotNull(folaAC);
    }

    @Test
    public void AcSwitch() {
        AirConditioner folaAC = new AirConditioner();
        folaAC.setSwitch();
        assertEquals(true, folaAC.isOn());
    }

    @Test
    public void AcSwitchOff() {
        AirConditioner folaAC = new AirConditioner();
        folaAC.setSwitchOff();
        assertEquals(false, folaAC.isOff());
    }

    @Test
    public void AcIncreaseTemperature() {
        AirConditioner folaAC = new AirConditioner();
        folaAC.setSwitch();
        folaAC.increaseTemperature();
        assertEquals(17, folaAC.getTemperature());
    }

    @Test
    public void AcDecreaseTemperature() {
        AirConditioner folaAC = new AirConditioner();
        folaAC.setSwitch();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.decreaseTemperature();
        assertEquals(18, folaAC.getTemperature());
    }

    @Test
    public void IncreaseTemperatureBeyond30() {
        AirConditioner folaAC = new AirConditioner();
        folaAC.setSwitch();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        folaAC.increaseTemperature();
        assertEquals(30, folaAC.getTemperature());
    }

    @Test
    public void DecreaseTemperatureBelow16() {
        AirConditioner folaAC = new AirConditioner();
        folaAC.setSwitch();
        folaAC.decreaseTemperature();
        assertEquals(16, folaAC.getTemperature());
    }
}

